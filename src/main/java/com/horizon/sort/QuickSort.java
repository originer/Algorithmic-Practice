package com.horizon.sort;

/**
 * 快速排序，递归实现
 * for each (unsorted) partition
 * <p>
 * set first element as pivot
 * <p>
 * storeIndex = pivotIndex + 1
 * <p>
 * for i = pivotIndex + 1 to rightmostIndex
 * <p>
 * if element[i] < element[pivot]
 * <p>
 * swap(i, storeIndex); storeIndex++
 * <p>
 * swap(pivot, storeIndex - 1)
 */
public class QuickSort {
    public static int[] quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int baseNum = arr[start];//选基准值
            int midNum;//记录中间值
            int i = start;
            int j = end;
            do {
                while ((arr[i] < baseNum) && i < end) {
                    i++;
                }
                while ((arr[j] > baseNum) && j > start) {
                    j--;
                }
                if (i <= j) {
                    midNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = midNum;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                quickSort(arr, start, j);
            }
            if (end > i) {
                quickSort(arr, i, end);
            }
        }
        return arr;
    }
}
