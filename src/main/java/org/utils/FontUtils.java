package org.utils;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FontUtils {
    public static Font ttfLoad(String fileName) {
        try {
            InputStream is = FontUtils.class.getResourceAsStream(fileName);
            if (is == null) {
                throw new Exception("Font file not found at: " + fileName);
            }
            return Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception e) {
            e.printStackTrace();
            //Fallback
            return new Font("Serif", Font.PLAIN, 12);
        }
    }
}
