package com.hzt.leetcode.question.easy;

import com.hzt.leetcode.ListNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Que021 implements IQuestion {
    @Override
    public void run() {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode frist = new ListNode(0);
        ListNode node = frist;
        //拼接
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                node.next = l2;
                break;
            }
            if (l2 == null) {
                node.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            } else {
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            }
        }
        return frist.next;
    }

}
