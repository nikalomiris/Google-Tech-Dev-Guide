package com.kalomiris.personal.foundationsOfProgramming;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class Find_longest_word_in_dictionaryTest extends TestCase {
    public void testFindLongestWord() throws Exception {

        Find_longest_word_in_dictionary testedClass = new Find_longest_word_in_dictionary();
        List<String> words = new ArrayList<String>();
        words.add("able");
        words.add("ale");
        words.add("apple");
        words.add("bale");
        words.add("kangaroo");
        String s = "abppplee";
        assertEquals("apple", testedClass.findLongestWord(s, words));
    }

}