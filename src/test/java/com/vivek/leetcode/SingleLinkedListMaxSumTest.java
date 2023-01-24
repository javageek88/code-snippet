package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SingleLinkedListMaxSumTest {

    private SingleLinkedListMaxSum singleLinkedListMaxSum = new SingleLinkedListMaxSum();

    @Test
    public void testTwoNodes(){
        SingleLinkedListMaxSum.SingleLinkedListNode four = new SingleLinkedListMaxSum.SingleLinkedListNode(4, null);
        SingleLinkedListMaxSum.SingleLinkedListNode third = new SingleLinkedListMaxSum.SingleLinkedListNode(7, four);
        SingleLinkedListMaxSum.SingleLinkedListNode second = new SingleLinkedListMaxSum.SingleLinkedListNode(5, third);
        SingleLinkedListMaxSum.SingleLinkedListNode head = new SingleLinkedListMaxSum.SingleLinkedListNode(1, second);
        Assert.assertEquals(12, singleLinkedListMaxSum.maxData(head));;
    }

    @Test
    public void testTwoNodes_1(){
        SingleLinkedListMaxSum.SingleLinkedListNode four = new SingleLinkedListMaxSum.SingleLinkedListNode(4, null);
        SingleLinkedListMaxSum.SingleLinkedListNode third = new SingleLinkedListMaxSum.SingleLinkedListNode(7, four);
        SingleLinkedListMaxSum.SingleLinkedListNode second = new SingleLinkedListMaxSum.SingleLinkedListNode(5, third);
        SingleLinkedListMaxSum.SingleLinkedListNode head = new SingleLinkedListMaxSum.SingleLinkedListNode(1, second);
        Assert.assertEquals(12, singleLinkedListMaxSum.maxData(head));;
    }

    @Test
    public void testTwoNodes_2(){
        SingleLinkedListMaxSum.SingleLinkedListNode four = new SingleLinkedListMaxSum.SingleLinkedListNode(4, null);
        SingleLinkedListMaxSum.SingleLinkedListNode third = new SingleLinkedListMaxSum.SingleLinkedListNode(7, four);
        SingleLinkedListMaxSum.SingleLinkedListNode second = new SingleLinkedListMaxSum.SingleLinkedListNode(5, third);
        SingleLinkedListMaxSum.SingleLinkedListNode head = new SingleLinkedListMaxSum.SingleLinkedListNode(1, second);
        Assert.assertEquals(12, singleLinkedListMaxSum.maxData(head));;
    }

    @Test
    public void testTwoNodes_3                        (){
        SingleLinkedListMaxSum.SingleLinkedListNode four = new SingleLinkedListMaxSum.SingleLinkedListNode(4, null);
        SingleLinkedListMaxSum.SingleLinkedListNode third = new SingleLinkedListMaxSum.SingleLinkedListNode(7, four);
        SingleLinkedListMaxSum.SingleLinkedListNode second = new SingleLinkedListMaxSum.SingleLinkedListNode(5, third);
        SingleLinkedListMaxSum.SingleLinkedListNode head = new SingleLinkedListMaxSum.SingleLinkedListNode(1, second);
        Assert.assertEquals(12, singleLinkedListMaxSum.maxData(head));;
    }
}
