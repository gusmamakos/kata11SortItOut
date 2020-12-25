package com.mamakos;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Characters {
    public String message;

    public Characters(String line) {
        String temp = line.toLowerCase();

        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(temp);
        StringBuilder charactersOnly = new StringBuilder();
        while (matcher.find()) {
            charactersOnly.append(matcher.group());
        }

        var charArray = charactersOnly.toString().toCharArray();
        Arrays.sort(charArray);

        StringBuilder msg = new StringBuilder();
        for (char c : charArray) {
            msg.append(c);
        }
        this.message = msg.toString();
    }
    @Override
    public String toString(){
        return message;
    }

}
