package com.kalomiris.personal.foundationsofprogramming;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class MaxSpanTest extends TestCase {
    public void testGetMaxSpan() throws Exception {

        MaxSpan maxSpan = new MaxSpan();
        List<Integer> input1 = new ArrayList<Integer>();
        input1.add(1);
        input1.add(4);
        input1.add(2);
        input1.add(1);
        input1.add(4);
        input1.add(1);
        input1.add(4);

        List<Integer> input2 = new ArrayList<Integer>();
        input2.add(1);
        input2.add(2);
        input2.add(1);
        input2.add(1);
        input2.add(3);

        List<Integer> input3 = new ArrayList<Integer>();
        input3.add(1);
        input3.add(4);
        input3.add(2);
        input3.add(1);
        input3.add(4);
        input3.add(4);
        input3.add(4);

        List<Integer> input4 = new ArrayList<Integer>();
        input4.add(1);

        assertEquals(6, maxSpan.getMaxSpan(input1));
        assertEquals(4, maxSpan.getMaxSpan(input2));
        assertEquals(6, maxSpan.getMaxSpan(input3));
        assertEquals(1, maxSpan.getMaxSpan(input4));
    }

}