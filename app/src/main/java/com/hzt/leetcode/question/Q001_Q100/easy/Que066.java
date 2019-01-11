package com.hzt.leetcode.question.Q001_Q100.easy;

import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class Que066 implements IQuestion {
    @Override
    public void run() {
        int[] nums = new int[]{5, 6, 2, 0, 0, 4, 6, 2, 4, 9};
        plusOne(nums);
    }

    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;

        while (lastIndex >= 0 && ++digits[lastIndex] == 10) {
            digits[lastIndex] = 0;
            lastIndex--;
        }
        if (digits[0] == 0) {
            digits[0] = 0;
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
