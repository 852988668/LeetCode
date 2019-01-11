package com.hzt.leetcode.question.Q001_Q100.easy;

import com.hzt.leetcode.question.IQuestion;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *
 * 输入: "III"
 * 输出: 3
 * 示例 2:
 *
 * 输入: "IV"
 * 输出: 4
 * 示例 3:
 *
 * 输入: "IX"
 * 输出: 9
 * 示例 4:
 *
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 *
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Que013 implements IQuestion {


    @Override
    public void run() {
       romanToInt2("MCMXCIV");
    }


    public int romanToInt2(String s) {
        Map<Character, Integer> map = numMap();
        //总数
        int count = 0;
        //相同数累加
        int add = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {    //小于下一个，减去
                count -= (map.get(s.charAt(i)) + add);
                add = 0;
            } else if (map.get(s.charAt(i)) > map.get(s.charAt(i + 1))) {    //大于下一个，加上
                count += (map.get(s.charAt(i)) + add);
                add = 0;
            } else if (map.get(s.charAt(i)) == map.get(s.charAt(i + 1))) {//相等，累加
                add += map.get(s.charAt(i));
            }
        }
        //加上最后一位数
        count += (map.get(s.charAt(s.length() - 1)) + add);
        return count;
    }

    /**
     * 罗马字转数字
     */
    public Map<Character, Integer> numMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public int romanToInt(String s) {
        int[] nums = new int[s.length()];
        //转换数值
        for (int i = 0; i < s.length(); i++) {
            nums[i] = switchNum(s.charAt(i));
        }
        //总数
        int count = 0;
        //相同数累加
        int add = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (nums[i] < nums[i + 1]) {    //小于下一个，减去
                count -= (nums[i] + add);
                add = 0;
            } else if (nums[i] > nums[i + 1]) {    //大于下一个，加上
                count += (nums[i] + add);
                add = 0;
            } else if (nums[i] == nums[i + 1]) {//相等，累加
                add += nums[i];
            }
        }
        //加上最后一位数
        count += (nums[s.length() - 1] + add);
        return count;
    }

    /**
     * 罗马字转数字
     */
    public int switchNum(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        }
        return 0;
    }

}
