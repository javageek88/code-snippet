package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersInLinkedListTest {

    private static AddTwoNumbersInLinkedList addTwoNumbersInLinkedList = new AddTwoNumbersInLinkedList();

    @Test
    public void testEmptyList(){
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode resultNode = addTwoNumbersInLinkedList.addTwoNumbers(l1, l2);
        Assert.assertEquals(0, resultNode.val);
    }

    @Test
    public void testNullList(){
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode resultNode = addTwoNumbersInLinkedList.addTwoNumbers(l1, l2);
        Assert.assertEquals(0, resultNode.val);
    }

    @Test
    public void testEqualSizeList(){
        //42
        ListNode l11 = new ListNode(4);
        ListNode l1 = new ListNode(2);
        l1.next = l11;
        //65
        ListNode l21 = new ListNode(6);
        ListNode l2 = new ListNode(5);
        l2.next = l21;
        //42 + 65 = 107;
        ListNode resultNode = addTwoNumbersInLinkedList.addTwoNumbers(l1, l2);
        Assert.assertNotNull(resultNode);
    }
}
