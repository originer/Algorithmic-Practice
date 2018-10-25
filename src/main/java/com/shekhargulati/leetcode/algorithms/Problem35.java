package com.shekhargulati.leetcode.algorithms;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * Created by Horizon on 2018/10/10.
 */
public class Problem35 {
    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int []nums = {1,3,5,6};
        System.out.println(searchInsert(nums,7));
    }
}
