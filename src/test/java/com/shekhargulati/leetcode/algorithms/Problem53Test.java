package com.shekhargulati.leetcode.algorithms;

import com.shekhargulati.leetcode.algorithms.array.Problem53;
import org.junit.Test;

/**
 * Created by Horizon on 2018/9/8.
 */
public class Problem53Test {

    @Test
    public void maxSubArray() {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println( Problem53.maxSubArray(arr));
        assert Problem53.maxSubArray(arr) == 6;
    }
}