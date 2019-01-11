package com.hzt.leetcode.question.Q001_Q100.medium;

import com.hzt.leetcode.question.IQuestion;

public class Que048 implements IQuestion {
    @Override
    public void run() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        //最大下标
        int length = matrix.length - 1;
        //循环一半
        int num = matrix.length / 2;
        //v垂直
        for (int v = 0; v < num; v++) {
            //h水平
            for (int h = v; h < length - v; h++) {
                //记录左上角
                int sw = matrix[v][h];
                //左上角等于左下角
                matrix[v][h] = matrix[length - h][v];
                //左下角等于右下角
                matrix[length - h][v] = matrix[length - v][length - h];
                //右下角等于右上角
                matrix[length - v][length - h] = matrix[h][length - v];
                //右上角等于左上角
                matrix[h][length - v] = sw;
            }
        }
    }


}
