package com.shekhargulati.leetcode.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。
 * 假定每组输入只存在唯一答案。
 * Created by Horizon on 2018/10/25.
 */
public class Problem16 {

    public static int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //如果后面的一个数字跟前面一样就直接跳过，避免重复
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > target) {
                    r--;
                } else {
                    l++;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 4, 8, 16, 32, 64, 128};
        int[] nums = {-1,2,1,-4};
        System.out.println((threeSumClosest(nums, 1)));
    }

}
