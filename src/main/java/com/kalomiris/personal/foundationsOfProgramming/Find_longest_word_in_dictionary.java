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
            char[] chars = word.toCharArray();
            lettersIndex = indexOfFirstOccurrence(letters, word);
            if (lettersIndex == -1) {
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

    /**
     * Function that returns the index of the first occurrence of the first character of the word in the letters
     * @param letters Sequence of the letters that could contain the character
     * @param word Sequence that it's first character will be checked
     * @return The index of first occurrence if found else returns -1
     */
    private int indexOfFirstOccurrence(String letters, String word) {
        int lettersIndex = 0;
        int result = -1;
        while (lettersIndex < letters.length()) {
            if (letters.charAt(lettersIndex) == word.charAt(0)) {
                result = lettersIndex;
                break;
            } else {
                lettersIndex++;
            }
        }

        return result;
    }
}
