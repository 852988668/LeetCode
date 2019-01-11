package com.hzt.leetcode.question.Q101_Q200.easy;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * <p>
 * 示例 1:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7]
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回 true 。
 * <p>
 * 示例 2:
 * <p>
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 * <p>
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * 返回 false 。
 */
public class Que110 implements IQuestion {
    @Override
    public void run() {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        //有节点不是平衡二叉树
        if (!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        }
        //判断自身是不是平衡二叉树
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);
        return (left > right ? (left - right) : (right - left)) <= 1;
    }

    /**
     * 树高度
     * @param tree
     * @return
     */
    public int treeHeight(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        //左节点高度
        int left = treeHeight(tree.left);
        //右节点高度
        int right = treeHeight(tree.right);
        return (left > right ? left : right) + 1;
    }
}
