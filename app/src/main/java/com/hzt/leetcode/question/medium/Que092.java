package com.hzt.leetcode.question.medium;

import android.os.Parcel;

import com.hzt.leetcode.ListNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * <p>
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 */
public class Que092 implements IQuestion {
    @Override
    public void run() {

    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head.next == null) {
            return head;
        }
        ListNode node = head;
        if (m == 1) {
            head = reverseList(node, n - m);
        } else {
            for (int i = 1; i < m - 1; i++) {
                node = node.next;
            }
            node.next = reverseList(node, n - m);
        }
        return head;
    }

    public ListNode reverseList(ListNode head, int num) {
        ListNode fristNode = head;
        //前一个
        ListNode preNode = head;
        ListNode node = head.next;
        //后一个
        ListNode nextNode = null;
        while (num-- != -1) {
            //拿到下一个
            nextNode = node.next;
            //当前指向前一个
            node.next = preNode;
            //前一个指向当前
            preNode = node;
            //当前变为后一个
            node = nextNode;
        }
        fristNode.next = nextNode;
        return preNode;
    }
}
