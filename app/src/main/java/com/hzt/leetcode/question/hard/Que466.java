package com.hzt.leetcode.question.hard;

import com.hzt.leetcode.question.IQuestion;

/**
 * 定义由 n 个连接的字符串 s 组成字符串 S，即 S = [s,n]。例如，["abc", 3]=“abcabcabc”。
 * <p>
 * 另一方面，如果我们可以从 s2 中删除某些字符使其变为 s1，我们称字符串 s1 可以从字符串 s2 获得。例如，“abc” 可以根据我们的定义从 “abdbec” 获得，但不能从 “acbbe” 获得。
 * <p>
 * 现在给出两个非空字符串 S1 和 S2（每个最多 100 个字符长）和两个整数 0 ≤ N1 ≤ 106 和 1 ≤ N2 ≤ 106。现在考虑字符串 S1 和 S2，其中S1=[s1,n1]和S2=[s2,n2]。找出可以使[S2,M]从 S1 获得的最大整数 M。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * s1 ="acb",n1 = 4
 * s2 ="ab",n2 = 2
 * <p>
 * 返回：
 * 2
 */
public class Que466 implements IQuestion {
    @Override
    public void run() {
        getMaxRepetitions(
                "niconiconi",
                99981,
                "nico",
                81);
    }

    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        //数组下标
        int pos1 = 0, pos2 = 0;
        //可以组成s2组的次数
        long count = 0;
        //s1重复次数
        long loopNum = 0;
        //s1循环超出最大次数
        while (loopNum < n1) {
            //匹配则s2向后移位
            if (c1[pos1] == c2[pos2]) {
                pos2++;
                //移动到末尾则从首位再匹配
                if (pos2 == c2.length) {
                    count++;
                    pos2 = 0;
                }
            }
            //s1下标后移
            pos1++;
            //s1到末尾
            if (pos1 == c1.length) {
                loopNum++;
                pos1 = 0;
                //正好满足整数数量s2
                if (pos2 == 0) {
                    break;
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        //防止溢出
        long result = (n1 * count) / (n2 * loopNum);
        return (int) result;
    }
}
