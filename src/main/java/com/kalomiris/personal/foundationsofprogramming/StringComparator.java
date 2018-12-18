package com.kalomiris.personal.foundationsofprogramming;

import java.util.Comparator;

/**
 * This class sorts a list of strings by length(longest first)
 * @author  Kalomiris Nikos
 */
public class StringComparator implements Comparator<String> {

    private int referenceLength;

    public StringComparator(String reference) {
        super();
        this.referenceLength = reference.length();
    }

    public int compare(String s1, String s2) {
        int dist1 = Math.abs(s1.length() - referenceLength);
        int dist2 = Math.abs(s2.length() - referenceLength);

        return dist2 - dist1;
    }
}
