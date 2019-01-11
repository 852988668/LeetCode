package com.hzt.leetcode.question.Q001_Q100.medium;

import android.util.Log;

import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba"也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Que005 implements IQuestion {
    @Override
    public void run() {
        Log.i("Que5", longestPalindrome("abcda"));
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] datas = s.toCharArray();
        int max = 0;
        int start = 0, end = 0;
        //从首位开始
        for (int i = 0; i < datas.length; i++) {
            //如果剩下的数量比最长的回文少，结束循环
            if (datas.length - i < max) {
                break;
            }
            //从最后位置开始往前
            for (int j = datas.length - 1; j >= i; j--) {
                //如果首字母和末字母一样
                if (datas[i] == datas[j]) {
                    //判断是否为回文
                    if (check(datas, i, j)) {
                        //计算该回文长度
                        int count = j - i + 1;
                        //比原来的长
                        if (count > max) {
                            //记录该回文起始位和结束
                            start = i;
                            end = j;
                            //重新记录最大回文长度
                            max = count;
                        }
                        break;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }

    //检查数组datas从start到end的子串是否为回文
    public boolean check(char[] datas, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (datas[i] != datas[j]) {
                return false;
            }
        }
        return true;
    }
}
