package com.hzt.leetcode.question.Q001_Q100.easy;

import com.hzt.leetcode.question.IQuestion;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Que009 implements IQuestion {


    @Override
    public void run() {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // return new StringBuilder(x+"").reverse().toString().equals(x+"");
        int a = x, b = 0;
        //反转数字
        while (a != 0) {
            b = b * 10 + a % 10;
            a /= 10;
        }
        if (x == b) {
            return true;
        }
        return false;
    }

}
