package com.hzt.leetcode.question.hard;

import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * <p>
 * 示例:
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 说明:
 * <p>
 * 假设你总是可以到达数组的最后一个位置。
 */
public class Que045 implements IQuestion {
    @Override
    public void run() {
        int[] nums = new int[]{2, 3, 1};
        jump(nums);
    }


    public int jump(int[] nums) {
        //跳跃次数
        int jumpNum = 0;
        //目前最大下标
        int pos = 0;
        //没到达最后一位
        while (pos < nums.length - 1) {
            //计算下一次能到达最大下标
            jumpNum++;
            pos = max(nums, pos + 1, pos + nums[pos]);
        }
        return jumpNum;
    }

    /**
     * nums从start到end中最大的跳跃下标数
     *
     * @param nums
     * @param start
     * @param end
     * @return
     */
    public int max(int[] nums, int start, int end) {
        //能到达最后一位
        if (end >= nums.length - 1) {
            return nums.length - 1;
        }
        //需要加上自身下标
        int max = nums[end] + end;
        int maxPos = end;
        //算出最大跳跃位
        for (int i = start; i < end; i++) {
            if (max < nums[i] + i) {
                max = nums[i] + i;
                maxPos = i;
            }
        }
        return maxPos;
    }


}
