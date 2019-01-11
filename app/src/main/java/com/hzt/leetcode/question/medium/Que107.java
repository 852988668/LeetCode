package com.hzt.leetcode.question.medium;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其自底向上的层次遍历为：
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */
public class Que107 implements IQuestion {
    @Override
    public void run() {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        order(root, 0, lists);
        Collections.reverse(lists);
        return lists;
    }

    /**
     * 递归
     *
     * @param tree
     * @param level 层级
     * @param lists
     */
    public void order(TreeNode tree, int level, List<List<Integer>> lists) {
        if (tree == null) {
            return;
        }
        //根据层级增加数组
        while (lists.size() <= level) {
            lists.add(new ArrayList<Integer>());
        }
        lists.get(level).add(tree.val);
        order(tree.left, level + 1, lists);
        order(tree.right, level + 1, lists);
    }
}
