package com.hzt.leetcode.question.Q001_Q100.medium;

import com.hzt.leetcode.ListNode;
import com.hzt.leetcode.question.IQuestion;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 */
public class Que061 implements IQuestion {
    @Override
    public void run() {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int length = linkLength(head, head);
        //计算首位
        int num = length - (k % length);
        //找到末尾
        for (int i = 0; i < num - 1; i++) {
            head = head.next;
        }
        //新的首位
        ListNode node = head.next;
        //末尾无指向
        head.next = null;
        return node;

    }

    /**
     * 计算链表长度，并让最后一位指向首位
     * @param head
     * @param listNode
     * @return
     */
    public int linkLength(ListNode head, ListNode listNode) {
        if (listNode.next == null) {
            listNode.next = head;
            return 1;
        }
        return linkLength(head, listNode.next) + 1;
    }
}
