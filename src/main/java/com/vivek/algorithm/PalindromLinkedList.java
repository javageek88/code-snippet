package com.vivek.algorithm;

import com.vivek.models.LinkedListNode;

public class PalindromLinkedList {

    public static class Result {
        public LinkedListNode node;
        public boolean result;

        public Result(LinkedListNode node, boolean result) {
            this.node = node;
            this.result = result;
        }
    }

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(4);
        LinkedListNode node3 = new LinkedListNode(5);
        LinkedListNode node4 = new LinkedListNode(4);
        LinkedListNode node5 = new LinkedListNode(2);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        int length = lengthOfList(node1);
        System.out.println("length = " + length);
        Result p = isPalindromeRecurse(node1, length);
        System.out.println("p.result = " + p.result);
    }

    public static Result isPalindromeRecurse(LinkedListNode head, int length) {
        if (head == null || length == 0) {
            return new Result(head, true);
        } else if (length == 1) {
            return new Result(head.next, true);
        }
        Result res = isPalindromeRecurse(head.next, length - 2);
        if (!res.result || res.node == null) {
            return res;
        }
        res.result = (head.data == res.node.data);

        res.node = res.node.next;
        return res;
    }

    public static int lengthOfList(LinkedListNode n) {
        int size = 0;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }


}
