package org.utils;

import org.utils.FontUtils;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class InputField extends JTextArea {
    public InputField(int rows, int columns){
        super(rows, columns);

        setStyle();
    }

    private void setStyle(){
        Font newFont = FontUtils.ttfLoad("/assets/fonts/JetBrainsMono/JetBrainsMono-Regular.ttf");

        this.setFont(newFont.deriveFont(Font.PLAIN, 16f));
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setCaretColor(new Color(100, 100, 255));
        this.setFocusable(true);

    }
}
