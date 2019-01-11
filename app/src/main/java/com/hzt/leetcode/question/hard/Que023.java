package com.hzt.leetcode.question.hard;


import com.hzt.leetcode.ListNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class Que023 implements IQuestion {
    @Override
    public void run() {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return sort(lists, 0, lists.length - 1);
    }

    //归并排序递归
    public ListNode sort(ListNode[] lists, int start, int end) {
        if (start >= end) {
            return lists[start];
        } else {
            int mid = (start + end) / 2;
            ListNode l1 = sort(lists, start, mid);
            ListNode l2 = sort(lists, mid + 1, end);
            return mergeTwoLists(l1, l2);
        }
    }

    //合并2个链表
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
