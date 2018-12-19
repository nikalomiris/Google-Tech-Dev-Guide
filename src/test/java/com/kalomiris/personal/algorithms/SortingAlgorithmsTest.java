package com.kalomiris.personal.algorithms;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmsTest extends TestCase {

    private int[] input = new int[10000000];
    private int[] sortedInput = new int[10000000];
    private SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
    private Random rand = new Random();

    private void initArrays(){
        for (int i = 0; i < input.length; i++) {
            input[i] = rand.nextInt();
        }
        sortedInput = input;
        Arrays.sort(sortedInput);
    }

    public void testMergeSort() throws Exception {

        initArrays();
        long startTime = System.currentTimeMillis();

        // TODO Optimize it.
        assertTrue(Arrays.equals(sortedInput, sortingAlgorithms.mergeSort(input)));

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("mergeSort sorted " + input.length + " numbers in " + elapsedTime + " miliseconds");
    }

    public void testInsertionSort() throws Exception {

        initArrays();
        long startTime = System.currentTimeMillis();

        assertTrue(Arrays.equals(sortedInput, sortingAlgorithms.insertionSort(input)));

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("insertionSort sorted " + input.length + " numbers in " + elapsedTime + " miliseconds");
    }

}