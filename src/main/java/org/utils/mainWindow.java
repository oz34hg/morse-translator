package org.utils;

import javax.swing.*;
import java.awt.*;


public class mainWindow extends JFrame{

    public mainWindow() {
        // create card layout
        CardLayout layoutCards = new CardLayout();
        JPanel deck = new JPanel(layoutCards);

        // create buttons for main panel
        JButton b1 = new JButton("Translate to Morse");
        JButton b2 = new JButton("Translate from Morse");
        JButton b3 = new JButton("MENU");
        JButton b4 = new JButton("MENU");

        JButton translateTo = new JButton("Translate");
        JButton translateFrom = new JButton("Translate");

        // set design for buttons


        JPanel mainPanel = new JPanel();
        JPanel toMorse = new JPanel();
        JPanel fromMorse = new JPanel();

        toMorse.setLayout(new GridLayout());
        fromMorse.setLayout(new GridLayout());

        // sets size and place for the mainPanel
        mainPanel.setSize(800, 800);
        mainPanel.setLayout(new GridLayout());

        // sets size for toMorse panel
        toMorse.setSize(800, 800);
        // sets size for fromMorse panel
        fromMorse.setSize(800, 800);


        mainPanel.add(b1);
        mainPanel.add(b2);


        // add panels to deck layout
        deck.add(mainPanel, "mainPage");
        deck.add(toMorse, "TranslateToMorse");
        deck.add(fromMorse, "TranslateFromMorse");


        this.add(deck);

        // add home button to both layouts
        toMorse.add(b3);
        fromMorse.add(b4);


        // handle the clicks on the buttons
        b1.addActionListener(e -> layoutCards.show(deck, "TranslateToMorse"));
        b2.addActionListener(e -> layoutCards.show(deck, "TranslateFromMorse"));
        b3.addActionListener(e -> layoutCards.show(deck, "mainPage"));
        b4.addActionListener(e -> layoutCards.show(deck, "mainPage"));

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