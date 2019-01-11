package com.hzt.leetcode.question.medium;

import com.hzt.leetcode.ListNode;
import com.hzt.leetcode.question.IQuestion;

import java.util.ArrayList;
import java.util.List;

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
public class Que002 implements IQuestion {

    @Override
    public void run() {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = getCount(l1, l2);
        ListNode result = new ListNode(count % 10);
        ListNode link = result;
        l1 = l1.next;
        l2 = l2.next;
        //都为空则没数字了
        while (l1 != null || l2 != null) {
            //2个的和加上前一个如果有进位
            count = getCount(l1, l2) + (count >= 10 ? 1 : 0);
            //只要个位数
            ListNode ln = new ListNode(count % 10);
            link.next = ln;
            link = ln;
            //后移
            if (l1 != null) {
                l1 = l1.next;
            }
            //后移
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        //防止最后一个进位漏了
        if (count >= 10) {
            link.next = new ListNode(1);
        }
        return result;
    }

    //返回ln的val值，为空返回0
    public int getCount(ListNode ln1, ListNode ln2) {
        return (ln1 == null ? 0 : ln1.val) + (ln2 == null ? 0 : ln2.val);
    }




}
