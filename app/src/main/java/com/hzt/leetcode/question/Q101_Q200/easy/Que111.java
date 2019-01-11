package com.hzt.leetcode.question.Q101_Q200.easy;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最小深度  2.
 */
public class Que111 implements IQuestion {
    @Override
    public void run() {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return route(root, 0);
    }

    public int route(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        //根节点
        if (node.left == null && node.right == null) {
            return depth + 1;
        }
        //没有右节点
        else if (node.right == null) {
            return route(node.left, depth + 1);
        }
        //沒有左节点
        else if (node.left == null) {
            return route(node.right, depth + 1);
        }
        return Math.min(route(node.left, depth + 1), route(node.right, depth + 1));
    }
}
