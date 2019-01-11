package com.hzt.leetcode.question.medium;
/**
 * 初始时有 n 个灯泡关闭。 第 1 轮，你打开所有的灯泡。 第 2 轮，每两个灯泡你关闭一次。 第 3 轮，每三个灯泡切换一次开关（如果关闭则开启，如果开启则关闭）。第 i 轮，每 i 个灯泡切换一次开关。 对于第 n 轮，你只切换最后一个灯泡的开关。 找出 n 轮后有多少个亮着的灯泡。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出: 1
 * 解释:
 * 初始时, 灯泡状态 [关闭, 关闭, 关闭].
 * 第一轮后, 灯泡状态 [开启, 开启, 开启].
 * 第二轮后, 灯泡状态 [开启, 关闭, 开启].
 * 第三轮后, 灯泡状态 [开启, 关闭, 关闭].
 * <p>
 * 你应该返回 1，因为只有一个灯泡还亮着。
 */

import com.hzt.leetcode.question.IQuestion;

public class Que319 implements IQuestion {
    @Override
    public void run() {

    }

    /**
     * 第一次所有开启，如果i能被因式分解成x*y，则正好开关各一次，然后到第i次时候关闭，当x=y时，关闭一次，到i次时候开始
     * 所以只有为平方数时才开启，否则关闭
     * @param n
     * @return
     */
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
