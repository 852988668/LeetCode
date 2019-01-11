package com.hzt.leetcode.question.medium;

import com.hzt.leetcode.question.IQuestion;

/**
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * <p>
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 */
public class Que238 implements IQuestion {
    @Override
    public void run() {

    }

    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        //初始化边缘
        int left = nums[0], right = nums[nums.length - 1];
        output[0] = 1;
        //循环令i位置等于左边所有数乘积
        for (int i = 1; i < nums.length; i++) {
            output[i] = left;
            left *= nums[i];
        }
        //循环让i位置乘上右边所有数乘积
        for (int i = nums.length - 2; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }
}
