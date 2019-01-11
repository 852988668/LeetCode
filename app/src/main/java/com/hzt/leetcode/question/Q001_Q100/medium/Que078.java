package com.hzt.leetcode.question.Q001_Q100.medium;

import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 */
public class Que078 implements IQuestion {
    @Override
    public void run() {
        int[] nums = new int[]{1, 2, 3};
        subsets(nums);
    }

    /**
     * 二进制01解法，0加入，1不加入
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = (int) Math.pow(2, nums.length);
        for (int i = 0; i < n; i++) {
            List<Integer> data = new ArrayList<>();
            int num = i;
            int index = nums.length;
            while (num != 0) {
                index--;
                if (num % 2 == 1) {
                    data.add(nums[index]);
                }
                num = num >> 1;
            }
            result.add(data);
        }
        return result;
    }
}
