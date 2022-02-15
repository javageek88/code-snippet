package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListPlusOneTest {

    @Test
    public void testAddThreeDigitWithNoNine(){
        LinkedListPlusOne linkedListPlusOne = new LinkedListPlusOne();
        ListNode next2 = new ListNode(3);
        ListNode next1 = new ListNode(2, next2);
        ListNode head = new ListNode(1, next1);
        ListNode returnNode = linkedListPlusOne.plusOne(head);
        Assert.assertEquals(4, returnNode.next.next.val);
    }

    @Test
    public void testAddThreeDigitWithNine(){
        LinkedListPlusOne linkedListPlusOne = new LinkedListPlusOne();
        ListNode next2 = new ListNode(9);
        ListNode next1 = new ListNode(2, next2);
        ListNode head = new ListNode(1, next1);
        ListNode returnNode = linkedListPlusOne.plusOne(head);
        Assert.assertEquals(3, returnNode.next.val);
    }

    @Test
    public void testAddThreeDigitWithNineNine(){
        LinkedListPlusOne linkedListPlusOne = new LinkedListPlusOne();
        ListNode next2 = new ListNode(9);
        ListNode next1 = new ListNode(9, next2);
        ListNode head = new ListNode(1, next1);
        ListNode returnNode = linkedListPlusOne.plusOne(head);
        Assert.assertEquals(2, returnNode.val);
    }

    @Test
    public void testAddThreeDigitWithNineNineNine(){
        LinkedListPlusOne linkedListPlusOne = new LinkedListPlusOne();
        ListNode next2 = new ListNode(9);
        ListNode next1 = new ListNode(9, next2);
        ListNode head = new ListNode(9, next1);
        ListNode returnNode = linkedListPlusOne.plusOne(head);
        Assert.assertEquals(1, returnNode.val);
    }
}
