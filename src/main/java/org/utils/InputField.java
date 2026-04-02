package org.utils;

import org.utils.FontUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class InputField extends JTextArea {

    public InputField(int rows, int columns){
        super(rows, columns);

        setStyle();

        JButton copy = new JButton("⧉");
        copy.setMargin(new Insets(2, 4, 2, 4));
        copy.setFocusable(false);
        copy.setBorderPainted(false);
        copy.setContentAreaFilled(false);
        copy.setToolTipText("Copy");
        copy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        copy.addActionListener(e -> {
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new StringSelection(getText()), null);

            String oldText = copy.getText();
            copy.setText("✔");
            copy.setEnabled(false);

            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    SwingUtilities.invokeLater(() -> {
                        copy.setText(oldText);
                        copy.setEnabled(true);
                    });
                }
            }, 1000);
        });

        JButton export = new JButton("⇩");
        export.setMargin(new Insets(2, 4, 2, 4));
        export.setFocusable(false);
        export.setBorderPainted(false);
        export.setContentAreaFilled(false);
        export.setToolTipText("Export to .txt");
        export.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        export.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save as TXT");
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
                    writer.write(getText());
                    JOptionPane.showMessageDialog(this,
                            "File saved: " + fileChooser.getSelectedFile().getAbsolutePath());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Error saving file: " + ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton play = new JButton("▶");
        play.setMargin(new Insets(2, 4, 2, 4));
        play.setFocusable(false);
        play.setBorderPainted(false);
        play.setContentAreaFilled(false);
        play.setToolTipText("Play Morse Audio");
        play.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        play.addActionListener(e -> playMorseAudio(getText()));

        setLayout(null);
        add(copy);
        add(export);
        add(play);

        copy.setBounds(getWidth() - 35, 5, 30, 20);
        export.setBounds(getWidth() - 35, 30, 30, 20);
        play.setBounds(getWidth() - 35, 55, 30, 20);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                copy.setBounds(getWidth() - 35, 5, 30, 20);
                export.setBounds(getWidth() - 35, 30, 30, 20);
                play.setBounds(getWidth() - 35, 55, 30, 20);
            }
        });
    }

    private void setStyle(){
        Font newFont = FontUtils.ttfLoad("/assets/fonts/JetBrainsMono/JetBrainsMono-Regular.ttf");
        this.setFont(newFont.deriveFont(Font.PLAIN, 16f));
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setCaretColor(new Color(100, 100, 255));
        this.setFocusable(true);
        this.setMargin(new Insets(5, 5, 5, 40));
    }

    private void playMorseAudio(String morseCode) {
        final int DOT = 100; // ms
        final int DASH = 300; // ms
        final int FREQUENCY = 800; // Hz

        new Thread(() -> {
            for (char c : morseCode.toCharArray()) {
                try {
                    if (c == '.') beep(FREQUENCY, DOT);
                    else if (c == '-') beep(FREQUENCY, DASH);
                    else Thread.sleep(DOT); // space between symbols
                    Thread.sleep(DOT); // gap between dots/dashes
                } catch (InterruptedException ignored) {}
            }
        }).start();
    }

    private void beep(int freq, int durationMs) {
        try {
            byte[] buf = new byte[1];
            AudioFormat af = new AudioFormat((float) 44100, 8, 1, true, false);
            SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
            sdl.open(af);
            sdl.start();
            for (int i = 0; i < durationMs * 44100 / 1000; i++) {
                double angle = i / (44100.0 / freq) * 2.0 * Math.PI;
                buf[0] = (byte) (Math.sin(angle) * 100);
                sdl.write(buf, 0, 1);
            }
            sdl.drain();
            sdl.stop();
            sdl.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}