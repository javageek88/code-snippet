package com.vivek.leetcode;

public class AddTwoNumbersInLinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(0);
        if (l1 == null && l2 == null) return returnNode;
        //initialize the heads to head
        //iterate while heads are not null
        //traditional add elements + carry and store carry
        //store single digit into element head and move to next node
        int carry = 0;
        ListNode currNode = returnNode;
        while(l1 != null || l2 != null){
            int digit1 = l1!=null ? l1.val : 0;
            int digit2 = l2!=null ? l2.val : 0;
            int sum = digit1 + digit2 + carry;
            currNode.next = new ListNode(sum % 10);
            currNode = currNode.next;
            carry = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(carry > 0){
            currNode.next = new ListNode(carry);
        }
        return returnNode.next;
    }
}
