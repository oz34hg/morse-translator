package org.utils;

import org.utils.CheatSheetPanel;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        // Setup CardLayout and Deck
        CardLayout layoutCards = new CardLayout();
        JPanel deck = new JPanel(layoutCards);

        // Create Buttons and Input Fields
        ModernButton b1 = new ModernButton("Translate to Morse");
        ModernButton b2 = new ModernButton("Translate from Morse");
        ModernButton cheatSheetbtn = new ModernButton("Cheat Sheet");

        // Buttons for To Morse Panel
        ModernButton b3 = new ModernButton("MENU");
        ModernButton clearTo = new ModernButton("CLEAR");
        ModernButton translateTo = new ModernButton("TRANSLATE");

        // Buttons for From Morse Panel
        ModernButton b4 = new ModernButton("MENU");
        ModernButton clearFrom = new ModernButton("CLEAR");
        ModernButton translateFrom = new ModernButton("TRANSLATE");

        InputField field1 = new InputField(10, 5);
        InputField field2 = new InputField(10, 5);

        InputField outputField1 = new InputField(10, 5);
        outputField1.setEditable(false);
        outputField1.setFocusable(false);

        InputField outputField2 = new InputField(10, 5);
        outputField2.setEditable(false);
        outputField2.setFocusable(false);

        JScrollPane scrollPane1 = new JScrollPane(field1);
        JScrollPane scrollPane2 = new JScrollPane(field2);
        JScrollPane scrollOutput1 = new JScrollPane(outputField1);
        JScrollPane scrollOutput2 = new JScrollPane(outputField2);

        // Main Menu Panel Setup
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        CreateLogo logo = new CreateLogo("Morse Translator");
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        cheatSheetbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setMaximumSize(new Dimension(250, 100));
        b2.setMaximumSize(new Dimension(250, 100));
        cheatSheetbtn.setMaximumSize(new Dimension(250, 100));

        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(logo);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        mainPanel.add(b1);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        mainPanel.add(b2);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        mainPanel.add(cheatSheetbtn);
        mainPanel.add(Box.createVerticalGlue());

        // To Morse Panel Setup
        JPanel toMorse = new JPanel();
        toMorse.setLayout(new BoxLayout(toMorse, BoxLayout.Y_AXIS));
        toMorse.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblNormal1 = new JLabel("Normal Text");
        JLabel lblMorse1 = new JLabel("Morse Code");

        lblNormal1.setAlignmentX(Component.CENTER_ALIGNMENT);
        scrollPane1.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblMorse1.setAlignmentX(Component.CENTER_ALIGNMENT);
        scrollOutput1.setAlignmentX(Component.CENTER_ALIGNMENT);

        // cheat sheet panel setup
        CheatSheetPanel cheatSheet = new CheatSheetPanel(e -> layoutCards.show(deck, "mainPage"));

        // Create bottom button panel for To Morse
        JPanel bottomPanelTo = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        bottomPanelTo.setOpaque(false);
        bottomPanelTo.setMaximumSize(new Dimension(800, 60));

        b3.setPreferredSize(new Dimension(120, 50));
        clearTo.setPreferredSize(new Dimension(120, 50));
        translateTo.setPreferredSize(new Dimension(150, 50));

        bottomPanelTo.add(clearTo);
        bottomPanelTo.add(b3);
        bottomPanelTo.add(translateTo);

        toMorse.add(Box.createVerticalGlue());
        toMorse.add(lblNormal1);
        toMorse.add(Box.createRigidArea(new Dimension(0, 10)));
        toMorse.add(scrollPane1);
        toMorse.add(Box.createRigidArea(new Dimension(0, 20)));
        toMorse.add(lblMorse1);
        toMorse.add(Box.createRigidArea(new Dimension(0, 10)));
        toMorse.add(scrollOutput1);
        toMorse.add(Box.createRigidArea(new Dimension(0, 40)));
        toMorse.add(bottomPanelTo);
        toMorse.add(Box.createVerticalGlue());
        // From Morse Panel Setup
        JPanel fromMorse = new JPanel();
        fromMorse.setLayout(new BoxLayout(fromMorse, BoxLayout.Y_AXIS));
        fromMorse.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblMorse2 = new JLabel("Morse Code");
        JLabel lblNormal2 = new JLabel("Normal Text");

        lblMorse2.setAlignmentX(Component.CENTER_ALIGNMENT);
        scrollPane2.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblNormal2.setAlignmentX(Component.CENTER_ALIGNMENT);
        scrollOutput2.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Create bottom button panel for From Morse
        JPanel bottomPanelFrom = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        bottomPanelFrom.setOpaque(false);
        bottomPanelFrom.setMaximumSize(new Dimension(800, 60));

        b4.setPreferredSize(new Dimension(120, 50));
        clearFrom.setPreferredSize(new Dimension(120, 50));
        translateFrom.setPreferredSize(new Dimension(150, 50));

        bottomPanelFrom.add(clearFrom);
        bottomPanelFrom.add(b4);
        bottomPanelFrom.add(translateFrom);

        fromMorse.add(Box.createVerticalGlue());
        fromMorse.add(lblMorse2);
        fromMorse.add(Box.createRigidArea(new Dimension(0, 10)));
        fromMorse.add(scrollPane2);
        fromMorse.add(Box.createRigidArea(new Dimension(0, 20)));
        fromMorse.add(lblNormal2);
        fromMorse.add(Box.createRigidArea(new Dimension(0, 10)));
        fromMorse.add(scrollOutput2);
        fromMorse.add(Box.createRigidArea(new Dimension(0, 40)));
        fromMorse.add(bottomPanelFrom);
        fromMorse.add(Box.createVerticalGlue());

        // Final Assembly and Listeners
        deck.add(mainPanel, "mainPage");
        deck.add(toMorse, "TranslateToMorse");
        deck.add(fromMorse, "TranslateFromMorse");
        deck.add(cheatSheet, "CheatSheet");
        this.add(deck);

        // Navigation
        b1.addActionListener(e -> layoutCards.show(deck, "TranslateToMorse"));
        b2.addActionListener(e -> layoutCards.show(deck, "TranslateFromMorse"));
        b3.addActionListener(e -> layoutCards.show(deck, "mainPage"));
        b4.addActionListener(e -> layoutCards.show(deck, "mainPage"));
        cheatSheetbtn.addActionListener(e -> layoutCards.show(deck, "CheatSheet"));

        // Logic for Clear buttons
        clearTo.addActionListener(e -> { field1.setText(""); outputField1.setText(""); });
        clearFrom.addActionListener(e -> { field2.setText(""); outputField2.setText(""); });

        // logic for translate buttons
        translateTo.addActionListener(e ->{
            String input = field1.getText();
            String output = UtilMorse.encode(input);
            outputField1.setText(output);
        });
        translateFrom.addActionListener(e ->{
            String input = field2.getText();
            String output = UtilMorse.decode(input);
            outputField2.setText(output);
        });


        try {
            ImageIcon image = new ImageIcon(getClass().getResource("/assets/images/appIcon.png"));
            if (image != null && image.getImage() != null) {
                this.setIconImage(image.getImage());
            }
        } catch (Exception e) {
            System.err.println("Icon not found.");
        }

        this.setTitle("Morse Translator");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}