package com.horizon.leetcode.algorithms.array;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * Created by Horizon on 2018/11/11.
 */
public class Problem26 {


    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
           if (nums[i]!=nums[index]) {
               nums[++index] = nums[i];
           }
        }
        //长度是下标+1
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
    }
}
