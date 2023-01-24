package com.vivek.leetcode;

public class SingleLinkedListMaxSum {

    static class SingleLinkedListNode{
        int data;
        SingleLinkedListNode next;

        SingleLinkedListNode(int data, SingleLinkedListNode node){
            this.data = data;
            this.next = node;
        }
    }

    int max = Integer.MIN_VALUE;

    public int maxData(SingleLinkedListNode head) {
        int max = getSum(head);
        return max;
    }

    private int getSum(SingleLinkedListNode head) {
        int max = Integer.MIN_VALUE;
        while(head != null){
            SingleLinkedListNode node = head;
            SingleLinkedListNode prev = head;
            while(node.next != null){
                if(node.next.next == null) prev = node;
                node = node.next;
            }
            prev.next = null;
            max = Math.max(max, (head.data + node.data));
            head = head.next;
        }
        return max;
    }

    private SingleLinkedListNode getLast(SingleLinkedListNode head) {
        while(head.next != null){
            head = head.next;
        }
        return head;
    }
}
