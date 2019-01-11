package com.hzt.leetcode.question.Q001_Q100.easy;

import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 **/
public class Que035 implements IQuestion {

    int[] nums = new int[]{3, 5, 7, 9, 10};

    @Override
    public void run() {
        searchInsert(nums, 8);
    }

    public int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int start, int end, int target) {
        //比第一个小
        if (target < nums[start]) {
            return start;
        }
        //比最后一个大
        if (target > nums[end]) {
            return end + 1;
        }

        if (start == end) {
            if (nums[start] == target) {
                return start;
            } else if (nums[start] < target) {
                return start + 1;
            } else {
                return start - 1;
            }
        }
        int i = (start + end) / 2;
        if (nums[i] == target) {
            return i;
        } else if (nums[i] < target) {
            return search(nums, i + 1, end, target);
        } else {
            return search(nums, start, i - 1, target);
        }
    }
}
