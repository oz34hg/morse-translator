package org.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModernButton extends JButton {

    private Color hoverColor = new Color(40, 40, 40); // Slightly lighter than black
    private Color normalColor = Color.BLACK;
    private int cornerRadius = 20;

    public ModernButton(String buttonText) {
        super(buttonText);

        Font newFont = FontUtils.ttfLoad("/assets/fonts/Pirata_One/PirataOne-Regular.ttf");
        setFont(newFont.deriveFont(Font.PLAIN, 24f));


        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setBackground(normalColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Horizontal padding is key for the "cozy" wide-button look
        setMargin(new Insets(10, 25, 10, 25));

        // Hover Effect logic
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(normalColor);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Makes the edges smooth
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint the background
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        g2.dispose();

        // This paints the text/icon over the custom background
        super.paintComponent(g);
    }
}