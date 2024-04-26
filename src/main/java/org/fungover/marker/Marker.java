package org.fungover.marker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Marker {
    public static int messageMarker(String input) {
        char[] tokens = input.toCharArray();

        for (int i = 0; i < tokens.length - 3; i++) {
            Set<Character> set = new HashSet<>();
            char[] fourTokens = Arrays.copyOfRange(tokens, i, i + 4);
            for(char c : fourTokens){
                set.add(c);
            }
            if (set.size() == 4)
                return i+4;
        }
        return -1; //??
    }
}
