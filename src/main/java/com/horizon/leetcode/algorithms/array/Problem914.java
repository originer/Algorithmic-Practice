package com.horizon.leetcode.algorithms.array;

import java.util.Arrays;

/**
 * 给定一副牌，每张牌上都写着一个整数。
 * <p>
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * <p>
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 * 输入：[1,2,3,4,4,3,2,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
 * Created by Horizon on 2018/11/13.
 */
public class Problem914 {

    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length % 2 != 0) {
            return false;
        }
        Arrays.sort(deck);
        int count = 0;
        for (int i = 1; i < deck.length; i += 2) {
            if (deck[i] == deck[i + 1]) {
                count++;
            } else {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        System.out.println(hasGroupsSizeX(nums));
    }
}
