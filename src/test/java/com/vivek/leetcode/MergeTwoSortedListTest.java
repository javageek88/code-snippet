package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class MergeTwoSortedListTest {

    private MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
    private ListNode l1;
    private ListNode l21;

    @Before
    public void setUp(){
        ListNode l4 = new ListNode(4, null);
        ListNode l2 = new ListNode(2, l4);
        l1 = new ListNode(1, l2); //first node of first sorted list // 1,2,4
        ListNode l24 = new ListNode(4, null);
        ListNode l23 = new ListNode(3, l24);
        l21 = new ListNode(1, l23); //first node of second sorted list // 1,3,4
    }

    @Test
    public void testIfBothAreNull(){
        ListNode resultNode = mergeTwoSortedList.initiateMergeLists(null, null);
        Assert.assertNull(resultNode);
    }

    @Test
    public void testIfBothAreEmpty(){
        ListNode l1 = new ListNode(0, null);
        ListNode l2 = new ListNode(0, null);
        ListNode resultNode = mergeTwoSortedList.initiateMergeLists(l1, l2);
        Assert.assertEquals(0, resultNode.val);
    }

    @Test
    public void testIfOneNotEmpty(){
        ListNode l1 = new ListNode(0, null);
        ListNode resultNode = mergeTwoSortedList.initiateMergeLists(l1, l21);
        Assert.assertEquals(l1.val, resultNode.val);
        Assert.assertEquals(l1.next.next.val, resultNode.next.next.val);
    }

    @Test
    public void testIfNotEmpty(){
        ListNode resultNode = mergeTwoSortedList.initiateMergeLists(l1, l21);
        Assert.assertEquals(l1.val, resultNode.val);
        Assert.assertEquals(2, resultNode.next.next.val);
    }
}
