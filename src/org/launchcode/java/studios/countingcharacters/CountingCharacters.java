package org.launchcode.java.studios.countingcharacters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
        // i want to read lines from a file--usually theres a method in a method called realine;
        BufferedReader bufReader = new BufferedReader((new FileReader("quote.txt")));
        String line;
        HashMap<Character, Integer> charCounts = new HashMap<>();
        while ((line = bufReader.readLine()) != null) {
            // i want a case-insensitive
            for (char c : line.toLowerCase().toCharArray()) {
                if (c < 'a' || c > 'z') {
                    continue;
                }
                charCounts.putIfAbsent(c, 0);
                charCounts.put(c, charCounts.get(c)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
