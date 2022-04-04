package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoLinkedListsTest {

    private static MergeTwoLinkedLists mergeTwoLinkedLists = new MergeTwoLinkedLists();

    @Test
    public void testListsNull(){
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode returnNode = mergeTwoLinkedLists.mergeLists(l1, l2);
        Assert.assertNull(returnNode);
    }

    @Test
    public void testOneListNotNull(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        ListNode returnNode = mergeTwoLinkedLists.mergeLists(l1, l2);
        Assert.assertNotNull(returnNode);
    }

    @Test
    public void testOneListNotNull_1(){
        ListNode l1 = null;
        ListNode l2 = new ListNode(1);
        ListNode returnNode = mergeTwoLinkedLists.mergeLists(l1, l2);
        Assert.assertNotNull(returnNode);
    }

    @Test
    public void testValidListNode(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode returnNode = mergeTwoLinkedLists.mergeLists(l1, l2);
        Assert.assertNotNull(returnNode);
    }

    @Test
    public void testValidListNode_1(){
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        l1.next = l11;
        ListNode l12 = new ListNode(4);
        l11.next = l12;
        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        l2.next = l21;
        ListNode l22 = new ListNode(4);
        l21.next = l22;
        ListNode returnNode = mergeTwoLinkedLists.mergeLists(l1, l2);
        Assert.assertNotNull(returnNode);
    }
}
