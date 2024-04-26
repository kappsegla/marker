package org.fungover.marker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Marker {
    public static final int MARKER_SIZE = 4;

    public static void main(String[] args) {

    }

    public static int messageMarker(String input) {
        char[] tokens = input.toCharArray();
        for (int i = 0; i < tokens.length - (MARKER_SIZE - 1); i++) {
            Set<Character> set = new HashSet<>();
            char[] fourTokens = Arrays.copyOfRange(tokens, i, i + MARKER_SIZE);
            for(char c : fourTokens){
                if(!set.add(c))
                    break;
            }
            if (set.size() == MARKER_SIZE)
                return i + MARKER_SIZE;
        }
        return -1; //??
    }
}
