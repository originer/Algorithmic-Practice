package com.shekhargulati.leetcode.algorithms.array;

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * Created by Horizon on 2018/11/13.
 */
public class Problem88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }
    }
}
