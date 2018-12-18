package com.kalomiris.personal.foundationsofprogramming;

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

        assertTrue(testedClass.isSubsequence(s, words.get(0)));
        assertTrue(testedClass.isSubsequence(s, words.get(1)));
        assertTrue(testedClass.isSubsequence(s, words.get(2)));
        assertFalse(testedClass.isSubsequence(s, words.get(3)));
        assertFalse(testedClass.isSubsequence(s, words.get(4)));
        assertEquals("apple", testedClass.findLongestWord(s, words));
    }

}