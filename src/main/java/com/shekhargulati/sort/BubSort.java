package com.shekhargulati.sort;

/**
 * 冒泡排序
 * do
 *
 *   swapped = false
 *
 *   for i = 1 to indexOfLastUnsortedElement-1
 *
 *     if leftElement > rightElement
 *
 *       swap(leftElement, rightElement)
 *
 *       swapped = true; swapCounter++
 *
 * while swapped
 * Created by Horizon on 2018/11/19.
 */
public class BubSort {
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {//注意第二重循环的条件
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
