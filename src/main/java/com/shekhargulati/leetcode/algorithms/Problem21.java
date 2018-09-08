package com.shekhargulati.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Problem21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(l1.val);
        ListNode first = result;
        while (l1.next != null || l2.next != null) {
            if (l1.next == null) {
                result.next = new ListNode(l2.next.val);
                result = result.next;
            }
            if (l2.next == null) {
                result.next = new ListNode(l1.next.val);
                result = result.next;

            }
            if (l1.next.val <= l2.next.val) {
                result.next = new ListNode(l1.next.val);
                result = result.next;

            } else {
                result.next = new ListNode(l2.next.val);
                result = result.next;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l = mergeTwoLists(l1, l2);
        while (l.next != null) {
            System.out.println(l.next.val);
            l = l.next;
        }

        List list = new ArrayList();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}