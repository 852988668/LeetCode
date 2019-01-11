package com.hzt.leetcode.question.Q101_Q200.easy;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * <p>
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
public class Que108 implements IQuestion {
    @Override
    public void run() {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sort(nums, 0, nums.length - 1);
    }

    /**
     * 取中点做节点，左边做左子树，右边做右子树
     * @param nums
     * @param start
     * @param end
     * @return
     */
    public TreeNode sort(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int m = (start + end) / 2;
        TreeNode tree = new TreeNode(nums[m]);
        tree.left = sort(nums, start, m - 1);
        tree.right = sort(nums, m + 1, end);
        return tree;
    }
}
