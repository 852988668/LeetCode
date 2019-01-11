package com.hzt.leetcode.question.Q101_Q200.medium;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class Que102 implements IQuestion {
    @Override
    public void run() {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        order(root, 0, lists);
        return lists;
    }

    /**
     * 递归
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
