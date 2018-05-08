package com.hzt.leetcode.question.medium;

import com.hzt.leetcode.question.IQuestion;

/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
 * <p>
 * 实现一个将字符串进行指定行数变换的函数:
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 3
 * 输出: "PAHNAPLSIIGYIR"
 * 示例 2:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 4
 * 输出: "PINALSIGYAHRPI"
 * 解释:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class Que006 implements IQuestion {

    @Override
    public void run() {
        convert("A", 1);
    }


    public String convert(String s, int numRows) {
        //只要1行，直接返回
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        //每行计算
        for (int i = 0; i < numRows; i++) {
            //间隔数
            int num = numRows - 1;
            //第一行或最后一行
            if (i == 0 || i == numRows - 1) {
                //间隔为间隔数=2
                for (int j = i; j < s.length(); j += num * 2) {
                    result.append(s.charAt(j));
                }
            } else {//中间行
                //是否奇数列
                boolean isOdd = false;
                //奇数列间隔和偶数列间隔计算方式不同
                for (int j = i; j < s.length(); j += (isOdd ? num - i : i) * 2) {
                    result.append(s.charAt(j));
                    isOdd = !isOdd;
                }
            }
        }
        return result.toString();
    }
}
