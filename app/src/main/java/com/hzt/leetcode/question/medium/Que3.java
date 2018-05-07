package com.hzt.leetcode.question.medium;


import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例：
 * <p>
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * <p>
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * <p>
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 **/

public class Que3 implements IQuestion {
    @Override
    public void run() {
        lengthOfLongestSubstring("abcabcbb");
    }

    public int lengthOfLongestSubstring(String s) {
        char[] datas = s.toCharArray();
        int max = 0;
        List<Character> charList = new ArrayList();
        for (char c : datas) {
            if (!charList.contains(c)) {
                charList.add(c);
            } else {
                while (charList.indexOf(c) != -1) {
                    charList.remove(0);
                }
                charList.add(c);
            }
            max=getMax(max, charList.size());
        }
        return max;
    }


    public int getMax(int a,int b){
        return a>b?a:b;
    }
}
