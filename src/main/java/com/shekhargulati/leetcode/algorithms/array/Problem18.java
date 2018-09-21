package com.shekhargulati.leetcode.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 * Created by Horizon on 2018/9/21.
 */
public class Problem18 {

    /**
     * 参考三数之和，问题的关键是去除重复
     * @param nums
     * @param target
     * @return
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = nums.length-1; j > i + 2; j--) {
                //元素重复就跳过
                if ((i > 0 && nums[i] == nums[i - 1]) || (j < nums.length-1 && nums[j] == nums[j + 1])) continue;
                int l = i + 1, r = j - 1;
                while (l < r) {
                    int sum = nums[i]+nums[l]+nums[r]+nums[j];
                    if (sum==target) {
                        lists.add(Arrays.asList(nums[i],nums[l],nums[r],nums[j]));
                        while (l < r && nums[l] == nums[l + 1]) ++l;
                        while (l < r && nums[r] == nums[r - 1]) --r;
                        l++;
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else r--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        //int[] nums = {1, 0, -1, 0, -2, 2};
        int[] nums = {5,5,3,5,1,-5,1,-2};
        System.out.println(fourSum(nums,4));
    }
}
