package com.hzt.leetcode.question.medium;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
public class Que113 implements IQuestion {
    @Override
    public void run() {

    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        order(root, sum, lists, data);
        return lists;
    }

    /**
     * 递归
     *
     * @param root
     * @param sum
     * @param lists
     * @param data
     */
    public void order(TreeNode root, int sum, List<List<Integer>> lists, List<Integer> data) {
        if (root == null) {
            return;
        }
        //加入自身节点
        data.add(root.val);
        //自身为叶子节点且达到目标和
        if (root.left == null && root.right == null && sum - root.val == 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < data.size(); i++) {
                list.add(data.get(i));
            }
            lists.add(list);
        } else {
            order(root.left, sum - root.val, lists, data);
            order(root.right, sum - root.val, lists, data);
        }
        //移除自身
        data.remove(data.size() - 1);
    }
}
