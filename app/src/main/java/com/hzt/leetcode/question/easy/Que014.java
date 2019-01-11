package com.hzt.leetcode.question.easy;

import com.hzt.leetcode.question.IQuestion;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class Que014 implements IQuestion {
    @Override
    public void run() {

    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        int length = strs[0].length();
        //最短字符串的长度
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < length) {
                length = strs[i].length();
            }
        }
        //以最短字符串长度作为遍历次数
        for (int i = 0; i < length; i++) {
            //第i位字符
            char c = strs[0].charAt(i);
            //遍历
            for (int j = 0; j < strs.length; j++) {
                //相等继续，否则为最大长度
                if (c == strs[j].charAt(i)) {
                    continue;
                } else {
                    return sb.toString();
                }
            }
            //都相等则添加
            sb.append(c);
        }
        return sb.toString();
    }
}
