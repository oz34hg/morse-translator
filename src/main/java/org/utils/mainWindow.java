package org.utils;

import javax.swing.JFrame;


public class mainWindow extends JFrame{

    public mainWindow() {
        /*
        * The following part of the code handles the buttons on the
        * main panel which is then going to switch into the new panels
        * using the cardlayout which is going to be handled later
        * */





        // sets title for the window
        this.setTitle("MORSE TRANSLATOR");
        // sets title of this
        this.setSize(800, 800);
        // set to not be able to resize
        this.setResizable(false);
        // sets the window to be visible
        this.setVisible(true);
        // kills the program if closed
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    }
}