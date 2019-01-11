package com.hzt.leetcode.question.Q001_Q100.medium;

import com.hzt.leetcode.question.IQuestion;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。画 n 条垂直线，使得垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 注意：你不能倾斜容器，n 至少是2。
 */
public class Que011 implements IQuestion {
    @Override
    public void run() {
        maxArea(new int[]{2, 3, 4, 5, 18, 17, 6});
    }

    public int maxArea(int[] height) {
        //i从左往右，j从右往左
        int i = 0, j = height.length - 1;
        //是否左边的比较小
        boolean leftmix = height[i] < height[j];
        int max = getArea(i, height[i], j, height[j]);
        while (i != j) {
            //左边小，从左往右
            if (leftmix) {
                i++;
                //如果比前一个值更大
                if (height[i - 1] < height[i]) {
                    max = getMax(max, getArea(i, height[i], j, height[j]));
                    leftmix = height[i] < height[j];
                }
            } else {
                j--;
                if (height[j] > height[j + 1]) {
                    max = getMax(max, getArea(i, height[i], j, height[j]));
                    leftmix = height[i] < height[j];
                }
            }
        }
        return max;
    }

    /**
     * 获得2数中大的值
     *
     * @param a1
     * @param a2
     * @return
     */
    public int getMax(int a1, int a2) {
        return a1 > a2 ? a1 : a2;
    }

    /**
     * 获取面积
     *
     * @param w1
     * @param h1
     * @param w2
     * @param h2
     * @return
     */
    public int getArea(int w1, int h1, int w2, int h2) {
        //横坐标距离*小的纵坐标
        return (w2 - w1) * (h1 < h2 ? h1 : h2);
    }
}
