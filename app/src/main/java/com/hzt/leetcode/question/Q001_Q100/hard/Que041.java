package com.hzt.leetcode.question.Q001_Q100.hard;

import com.hzt.leetcode.question.IQuestion;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 */
public class Que041 implements IQuestion {
    @Override
    public void run() {

    }

    public int firstMissingPositive(int[] nums) {
        //set存放数字
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        //最小数
        int i = 0;
        //循环查看是否存在，存在则继续
        while (set.contains(++i)) {
        }
        return i;
    }
}
