package com.vivek.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 *
 * Constraints:
 *
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        //243
        ListNumberNode l1 = new ListNumberNode(9, null);
        ListNumberNode l2 = new ListNumberNode(9, l1);
        ListNumberNode l3 = new ListNumberNode(9, l2);
        ListNumberNode l4 = new ListNumberNode(9, l3);
        ListNumberNode l5 = new ListNumberNode(9, l4);
        ListNumberNode l6 = new ListNumberNode(9, l5);
        ListNumberNode l7 = new ListNumberNode(9, l6);
        //564
        ListNumberNode m1 = new ListNumberNode(9, null);
        ListNumberNode m2 = new ListNumberNode(9, m1);
        ListNumberNode m3 = new ListNumberNode(9, m2);
        ListNumberNode m4 = new ListNumberNode(9, m3);
        ListNumberNode result = addTwoNumbers(l7, m4);
        //708
    }

    public static ListNumberNode addTwoNumbers(ListNumberNode l1, ListNumberNode l2) {
        //1. iterate over first list node
        int nodeReminder = 0;
        int sum = 0;
        ListNumberNode result = null;
        ListNumberNode sumHead = new ListNumberNode(sum, null);
        ListNumberNode sumHeadNext = new ListNumberNode(nodeReminder, null);
        while(l1 !=null || l2!=null){
            sum = 0;
            if(l1!=null) sum+= l1.val;
            if(l2!=null) sum+= l2.val;

            //3. add each element from 1 and 2
            //4. add reminder and store reminder from 1 and 2
            int nodeVal = (sum + nodeReminder)%10;
            nodeReminder = (sum + nodeReminder)/10;

            //5. iterate over from 1 and continue till longest number
            if(result != null) {
                sumHeadNext = new ListNumberNode(nodeVal, null); //create sum head node
                sumHead.next = sumHeadNext;
                sumHead = sumHeadNext;
            }else{
                sumHead.val = nodeVal;
                result = sumHead;
            }
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(nodeReminder > 0){
            ListNumberNode sumHeadNextReminder = new ListNumberNode(nodeReminder, null); //create sum head node
            sumHead.next = sumHeadNextReminder;
        }
        return result;
    }

}

class ListNumberNode {
    int val;
    ListNumberNode next;
    ListNumberNode() {}
    ListNumberNode(int val) { this.val = val; }
    ListNumberNode(int val, ListNumberNode next) { this.val = val; this.next = next; }
}
