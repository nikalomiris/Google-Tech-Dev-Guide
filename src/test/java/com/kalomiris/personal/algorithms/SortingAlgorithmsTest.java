package com.kalomiris.personal.algorithms;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmsTest extends TestCase {

    private int[] input = new int[1000];
    private int[] sortedInput = new int[1000];
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

        // TODO Optimize it.
        assertTrue(Arrays.equals(sortedInput, sortingAlgorithms.mergeSort(input)));
    }

    public void testInsertionSort() throws Exception {

        initArrays();

        assertTrue(Arrays.equals(sortedInput, sortingAlgorithms.insertionSort(input)));
    }

    public void testQuickSort() throws Exception {

        initArrays();

        long startTime = System.currentTimeMillis();

        assertTrue(Arrays.equals(sortedInput, sortingAlgorithms.quickSort(input, 0, input.length - 1)));

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("mergeSort sorted " + input.length + " numbers in " + elapsedTime + " miliseconds");
    }
}