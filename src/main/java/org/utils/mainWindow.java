package org.utils;

import javax.swing.*;
import java.awt.*;
import org.utils.modernButton;


public class mainWindow extends JFrame{

    public mainWindow() {
        // create card layout
        CardLayout layoutCards = new CardLayout();
        JPanel deck = new JPanel(layoutCards);

        // create buttons for main panel
        JButton b1 = new JButton("Translate to Morse");
        JButton b2 = new JButton("Translate from Morse");
        // set design for buttons

        JPanel mainPanel = new JPanel();
        JPanel toMorse = new JPanel();
        JPanel fromMorse = new JPanel();

        // sets size and place for the mainPanel
        mainPanel.setSize(800, 800);
        mainPanel.setLayout(new GridLayout());

        // sets size for toMorse panel
        toMorse.setSize(800, 800);
        // sets size for fromMorse panel
        fromMorse.setSize(800, 800);


        mainPanel.add(b1);
        mainPanel.add(b2);
        mainPanel.add(b3);

        // add panels to deck layout
        deck.add(mainPanel, "mainPage");
        deck.add(toMorse, "TranslateToMorse");
        deck.add(fromMorse, "TranslateFromMorse");



        // sets title for the window
        this.setTitle("MORSE TRANSLATOR");
        // sets title of this
        this.setSize(800, 800);
        // set to not be able to resize
        this.setResizable(false);
        // sets the window to be visible
        this.setVisible(true);
        // sets no layout manager
        this.setLayout(null);
        // kills the program if closed
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    }
}