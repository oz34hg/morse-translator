package utils;

import javax.swing.*;


public class mainWindow extends JFrame{

    public mainWindow() {
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