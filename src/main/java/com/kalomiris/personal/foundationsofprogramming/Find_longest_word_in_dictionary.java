package com.kalomiris.personal.foundationsofprogramming;

import java.util.*;

/**
 * This class contains the solution of
 * https://techdevguide.withgoogle.com/paths/foundational/find-longest-word-in-dictionary-that-subsequence-of-given-string#!
 * @author  Kalomiris Nikos
*/
public class Find_longest_word_in_dictionary {

    public String findLongestWord(String letters, List<String> words) {

        Comparator comparator = new StringComparator("");
        String result = "";

        // Sort the list of words. That way we can return the first word that is a subsequence because it will be the longest.
        Collections.sort(words, comparator);

        for (String word : words) {
            if (isSubsequence(letters, word)) {
                return word;
            }
        }

        return "Non of the words is a subsequence of the letters.";
    }

    /**
     * Function that returns the index of the first occurrence of the first character of the word in the letters
     * @param letters Sequence of the letters that could contain the word
     * @param word Sequence that should exist as a subsequence
     * @return if the word is susequence of letters. Not necessarily continuous but the order of the letters is important.
     */
    protected boolean isSubsequence(String letters, String word) {
        int wordIndex = 0;
        for (int i = 0; i < letters.length(); i++) {
            if (wordIndex < word.length() && letters.charAt(i) == word.charAt(wordIndex)) {
                wordIndex++;
            }
        }
        return wordIndex == word.length();
    }
}
