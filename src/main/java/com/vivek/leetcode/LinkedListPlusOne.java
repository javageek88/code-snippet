package com.vivek.leetcode;

public class LinkedListPlusOne {

    public ListNode plusOne(ListNode head) {
        ListNode sentinalNode = new ListNode();
        sentinalNode.next = head;
        ListNode notNineNode = sentinalNode;
        while(head != null){
            if(head.val != 9){
                notNineNode = head;
            }
            head = head.next;
        }
        notNineNode.val = notNineNode.val + 1;
        notNineNode = notNineNode.next;
        while(notNineNode != null){
            notNineNode.val = 0;
            notNineNode = notNineNode.next;
        }
        return sentinalNode.val != 0 ? sentinalNode : sentinalNode.next;
    }
}
