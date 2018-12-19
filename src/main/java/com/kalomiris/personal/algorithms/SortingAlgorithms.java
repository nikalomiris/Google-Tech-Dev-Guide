package com.kalomiris.personal.algorithms;

public class SortingAlgorithms {

    // Variables used for merge mergesort
    private int[] numbers;
    private int[] helper;
    private int number;

    public int[] insertionSort(int[] input) {

        long startTime = System.currentTimeMillis();

        int key;
        for (int i = 1; i < input.length; i++) {
            key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("insertionSort sorted " + input.length + " numbers in " + elapsedTime + " miliseconds");

        return input;
    }

    public int[] mergeSort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];

        long startTime = System.currentTimeMillis();

        mergesort(0, number - 1);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("mergeSort sorted " + values.length + " numbers in " + elapsedTime + " miliseconds");

        return numbers;
    }

    public int[] quickSort(int[] input, int low, int high) {
        if (low < high) {
            int p = partition(input, low, high);
            quickSort(input, low, p - 1);
            quickSort(input, p + 1, high);
        }

        return input;
    }

    private int partition(int[] input, int low, int high) {
        int pivot = input[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (input[j] < pivot) {
                if (i != j) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
                i++;
            }
        }
        int temp = input[i];
        input[i] = input[high];
        input[high] = temp;

        return i;
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.

    }
}
