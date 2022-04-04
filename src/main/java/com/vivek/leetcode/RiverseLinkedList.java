package com.vivek.leetcode;

public class RiverseLinkedList {

    public ListNode riverseList(ListNode l1) {
        if(l1 == null || l1.next == null) return l1;
        //iterate while head is not null
        //store current node
        //prev node null
        //head = head.next
        ListNode head = l1, curr;
        ListNode prev = null;
        while (head != null){
            curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;

        }
        return prev;
    }
}
