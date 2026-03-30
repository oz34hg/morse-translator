package org;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import org.utils.MainWindow;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        SwingUtilities.invokeLater(() -> {
            new MainWindow();
        });
    }
}