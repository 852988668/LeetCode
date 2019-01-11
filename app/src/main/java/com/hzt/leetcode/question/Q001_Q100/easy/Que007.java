package com.hzt.leetcode.question.Q001_Q100.easy;


import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class Que007 implements IQuestion {
    @Override
    public void run() {
        reverse(-2147483648);
    }

    public int reverse(int x) {
        //长整型防止溢出
        long result = 0;
        while (x != 0) {
            //反转
            result = result * 10 + x % 10;
            //转为int是否溢出
            if (result > 2147483647 || result < -2147483648) {
                return 0;
            }
            x /= 10;
        }
        return (int) result;
    }
}
