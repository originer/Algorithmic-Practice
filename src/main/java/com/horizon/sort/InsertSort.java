package com.horizon.sort;

/**
 * 直接插入排序
 * mark first element as sorted
 *
 * for each unsorted element X
 *
 *   'extract' the element X
 *
 *   for j = lastSortedIndex down to 0
 *
 *     if current element j > X
 *
 *       move sorted element to the right by 1
 *
 *     break loop and insert X here
 *
 * Created by Horizon on 2018/11/19.
 */
public class InsertSort {


    public static int[] insertSort(int[] arr) {
        int len = arr.length;
        int insertNum;//要插入的数
        for (int i = 1; i < len; i++) {//因为第一次不用，所以从1开始
            insertNum = arr[i];
            int j = i - 1;//序列元素个数
            while (j >= 0 && arr[j] > insertNum) {//从后往前循环，将大于insertNum的数向后移动
                arr[j + 1] = arr[j];//元素向后移动
                j--;
            }
            arr[j + 1] = insertNum;//找到位置，插入当前元素
        }
        return arr;
    }
}
