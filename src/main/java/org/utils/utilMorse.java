package utils;

import java.util.*;

public class utilMorse {
    private static HashMap<String, String> morse = new HashMap<>();

    static {
        morse.put("A", ".-");
        morse.put("B", "-...");
        morse.put("C", "-.-.");
        morse.put("D", "-..");
        morse.put("E", ".");
        morse.put("F", "..-.");
        morse.put("G", "--.");
        morse.put("H", "....");
        morse.put("I", "..");
        morse.put("J", ".---");
        morse.put("K", "-.-");
        morse.put("L", ".-..");
        morse.put("M", "--");
        morse.put("N", "-.");
        morse.put("O", "---");
        morse.put("P", ".--.");
        morse.put("Q", "--.-");
        morse.put("R", ".-.");
        morse.put("S", "...");
        morse.put("T", "-");
        morse.put("U", "..-");
        morse.put("V", "...-");
        morse.put("W", ".--");
        morse.put("X", "-..-");
        morse.put("Y", "-.--");
        morse.put("Z", "--..");
    }

    public static String encode(String normalText) {

        ArrayList<String> finalMorse = new ArrayList<>();

        for (char c : normalText.toUpperCase().toCharArray()) {
            String s = String.valueOf(c);

            if (morse.containsKey(s)) {
                finalMorse.add(morse.get(s));

            } else if (s.equals(" ")) {
                continue;
            } else {
                finalMorse.add("?");
            }

        }
        return String.join(" ", finalMorse);
    }
}