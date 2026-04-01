package org.utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheatSheetPanel extends JPanel {

    public CheatSheetPanel(ActionListener backAction) {
        setLayout(new BorderLayout(0, 20)); // Vertical gap of 20
        setBorder(new EmptyBorder(30, 30, 30, 30));

        JPanel grid = new JPanel(new GridLayout(0, 4, 20, 10));
        String[] letters = {
                "A: •-", "B: -•••", "C: -•-•", "D: -••", "E: •", "F: ••-•",
                "G: --•", "H: ••••", "I: ••", "J: •---", "K: -•-", "L: •-••",
                "M: --", "N: -•", "O: ---", "P: •--•", "Q: --•-", "R: •-•",
                "S: •••", "T: -", "U: ••-", "V: ...-", "W: •--", "X: -..-",
                "Y: -.--", "Z: --..", "1: .----", "2: ..---", "3: ...--",
                "4: ....-", "5: .....", "6: -....", "7: --...", "8: ---..",
                "9: ----.", "0: -----"
        };

        for (String item : letters) {
            JLabel label = new JLabel(item);
            label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
            grid.add(label);
        }

        ModernButton backBtn = new ModernButton("BACK TO MENU");
        backBtn.setPreferredSize(new Dimension(200, 50));
        backBtn.addActionListener(backAction);

        // Center the button at the bottom
        JPanel buttonWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonWrapper.add(backBtn);

        // Add components to the main panel
        add(grid, BorderLayout.CENTER);
        add(buttonWrapper, BorderLayout.SOUTH);
    }
}