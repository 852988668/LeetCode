package com.hzt.leetcode.question.easy;

import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class Que118 implements IQuestion {
    @Override
    public void run() {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> data = new ArrayList<>();
            data.add(1);
            for (int j = 1; j < i - 1; j++) {
                data.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
            }
            if (i != 0) {
                data.add(i, 1);
            }
            lists.add(data);
        }
        return lists;
    }
}
