package com.hzt.leetcode.question.medium;

import com.hzt.leetcode.question.IQuestion;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class SolutionQue2 implements IQuestion {

    @Override
    public void run() {
        ListNode result = addTwoNumbers(make(9), make(9999999991L));
        makeNum(result);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return make(makeNum(l1) + makeNum(l2));
    }

    //ln转数字
    public long makeNum(ListNode ln) {
        long result = 0;
        long num = 1;
        while (ln != null) {
            result += ln.val * num;
            num *= 10;
            ln = ln.next;
        }
        return result;
    }

    //数字转ln
    public ListNode make(long num) {
        long x = num % 10;
        num /= 10;
        ListNode result = new ListNode((int) x);
        ListNode data = result;
        while (num != 0) {
            x = num % 10;
            num /= 10;
            ListNode ln = new ListNode((int) x);
            data.next = ln;
            data = ln;
        }
        return result;
    }


}
