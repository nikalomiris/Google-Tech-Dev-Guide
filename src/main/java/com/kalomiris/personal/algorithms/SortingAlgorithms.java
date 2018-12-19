package com.kalomiris.personal.algorithms;

public class SortingAlgorithms {

    private int[] numbers;
    private int[] helper;

    private int number;

    public int[] insertionSort(int[] input) {

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

        return input;
    }

    public int[] mergeSort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        sort(0, number - 1);

        return numbers;
    }

    private void sort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            sort(low, middle);
            sort(middle + 1, high);
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
