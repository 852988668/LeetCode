package com.hzt.leetcode.question.Q001_Q100.medium;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 */
public class Que094 implements IQuestion {
    @Override
    public void run() {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }

    public void recursion(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        recursion(root.left, list);
        list.add(root.val);
        recursion(root.right, list);
    }

    public List<Integer> iteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = root;
        while (node != null || !queue.isEmpty()) {
            while (node != null) {
                queue.add(node);
                node = node.left;
            }
            if (!queue.isEmpty()) {
                node = queue.pollLast();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }

}
