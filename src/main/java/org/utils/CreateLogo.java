package org.utils;

import org.utils.FontUtils;
import javax.swing.*;
import java.awt.*;

public class CreateLogo extends JLabel {

    public CreateLogo(String logoText){
        super(logoText);
        Font newFont = FontUtils.ttfLoad("/assets/fonts/Jacquard_12/Jacquard12-Regular.ttf");
        this.setFont(newFont.deriveFont(Font.PLAIN, 92f));
        this.setPreferredSize(new Dimension(800, 300));
        this.setMaximumSize(new Dimension(800, 300));
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
