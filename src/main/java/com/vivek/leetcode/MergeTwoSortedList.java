package com.vivek.leetcode;

public class MergeTwoSortedList {

    public ListNode initiateMergeLists(ListNode l1, ListNode l2) {
        printNodeValues(l1);
        printNodeValues(l2);

        ListNode resultNode = mergeTwoLists(l1, l2);
        printNodeValues(resultNode);
        return resultNode;
    }

    //Recursive approach
    /*public ListNode mergeTwoLists(ListNode A, ListNode B)
    {

        if(A == null) return B;
        if(B == null) return A;

        if(A.val < B.val)
        {
            A.next = mergeTwoLists(A.next, B);
            return A;
        }
        else
        {
            B.next = mergeTwoLists(A, B.next);
            return B;
        }

    }*/

    //dummyNode
    /*ListNode mergeTwoLists(ListNode headA, ListNode headB)
    {
        ListNode dummyNode = new ListNode(0);

        ListNode tail = dummyNode;
        while(true)
        {

            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

            if(headA.val <= headB.val)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }*/

    ListNode mergeTwoLists(ListNode a, ListNode b)
    {
        ListNode result = null;

        ListNode lastPtrRef = result;

        while(true)
        {
            if (a == null)
            {
                lastPtrRef = b;
                break;
            }
            else if (b==null)
            {
                lastPtrRef = a;
                break;
            }
            if(a.val <= b.val)
            {
                lastPtrRef = a;
                a = a.next;
            }
            else
            {
                lastPtrRef = b;
                b = b.next;
            }

            lastPtrRef = ((lastPtrRef).next);
        }
        return(result);
    }

    
    public static void printNodeValues(ListNode l1){
        System.out.print("List Node values : ");
        while(l1 != null){
            System.out.print(l1.val);
            l1 = l1.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
