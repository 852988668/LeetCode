package com.hzt.leetcode.question.easy;

import com.hzt.leetcode.ListNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class Que206 implements IQuestion {
    @Override
    public void run() {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //前一个
        ListNode preNode = null;
        //后一个
        ListNode nextNode;
        while (head != null) {
            //拿到下一个
            nextNode = head.next;
            //当前指向前一个
            head.next = preNode;
            //前一个指向当前
            preNode = head;
            //当前变为后一个
            head = nextNode;
        }
        return preNode;
    }


}
