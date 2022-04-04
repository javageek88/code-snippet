package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RiverseLinkedListTest {

    private static RiverseLinkedList riverseLinkedList = new RiverseLinkedList();

    @Test
    public void testListNull(){
        ListNode l1 = null;
        ListNode returnList = riverseLinkedList.riverseList(l1);
        Assert.assertNull(returnList);
    }

    @Test
    public void testListWithOneNode(){
        ListNode l1 = new ListNode(1);
        ListNode returnList = riverseLinkedList.riverseList(l1);
        Assert.assertNotNull(returnList);
        Assert.assertEquals(1, returnList.val);
    }

    @Test
    public void testListWithMultipleNodes(){
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        l1.next = l11;
        ListNode l12 = new ListNode(3);
        l11.next = l12;
        ListNode returnList = riverseLinkedList.riverseList(l1);
        Assert.assertNotNull(returnList);
        Assert.assertEquals(3, returnList.val);
    }
}
