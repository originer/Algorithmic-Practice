package com.horizon.sort;

/**
 * repeat (numOfElements - 1) times
 *
 *   set the first unsorted element as the minimum
 *
 *   for each of the unsorted elements
 *
 *     if element < currentMinimum
 *
 *       set element as new minimum
 *
 *   swap minimum with first unsorted positio
 */
public class SelectSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = findMinIndex(arr, i);
            swap(arr, i, min);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int min) {
        int tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
    }

    private static int findMinIndex(int[] arr, int i) {
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        return min;
    }
}
