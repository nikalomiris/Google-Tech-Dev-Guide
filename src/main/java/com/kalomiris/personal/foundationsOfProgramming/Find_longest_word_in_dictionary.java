package com.kalomiris.personal.foundationsOfProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class contains the solution of
 * https://techdevguide.withgoogle.com/paths/foundational/find-longest-word-in-dictionary-that-subsequence-of-given-string#!
 * @author  Kalomiris Nikos
*/
public class Find_longest_word_in_dictionary {

    public String findLongestWord(String letters, List<String> words) {

        String result = "";
        int lettersIndex = 0;
        boolean firstCharFound = false;
        boolean stillValid = false;
        boolean finalValid = false;

        for (String word : words) {
            firstCharFound = false;
            char[] chars = word.toCharArray();
            while (lettersIndex < letters.length()) {
                if (letters.charAt(lettersIndex) == chars[0]) {
                    break;
                } else {
                    firstCharFound = true;
                    lettersIndex++;
                }
            }
            if (!firstCharFound) {
                break;
            } else {
                for (int i = 1; i < chars.length; i++) {
                    if (lettersIndex >= letters.length()) {
                        break;
                    }
                    if (chars[i] != letters.charAt(lettersIndex)) {
                        lettersIndex++;
                        stillValid = false;
                    } else if (chars[i] == letters.charAt(lettersIndex) && i == chars.length - 1) {
                        finalValid = true;
                    } else {
                        lettersIndex++;
                        stillValid = true;
                    }
                }
            }
            if (finalValid && result.length() < word.length()) {
                result = word;
            }
        }

        return result;
    }
}
