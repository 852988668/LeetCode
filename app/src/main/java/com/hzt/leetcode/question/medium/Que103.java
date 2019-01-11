package com.hzt.leetcode.question.medium;

import com.hzt.leetcode.TreeNode;
import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层次遍历如下：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */
public class Que103 implements IQuestion {
    @Override
    public void run() {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        order(root, 0, lists);
        for (int i = 1; i < lists.size(); i += 2) {
            Collections.reverse(lists.get(i));
        }
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
