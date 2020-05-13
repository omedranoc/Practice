package com.example.practice.aws;

public class swapNodes {




    public static ListNode swapPairs(ListNode head) {
            //base case head == null and head.next = null
            //  head.next -> head
            // head -> head.next
            //recursion put in front of the next element
            if(head == null || head.next == null)
                return head;
            ListNode firstNode  = head; //l2
            ListNode secondNode = head.next;

            //  head == null
            //
            //    1 2 3 4  NULL
            //   4 NULl
            //

            firstNode.next = swapPairs(secondNode.next);
            secondNode.next = firstNode;
            //newHead.next = swapPairs(newHead.next); //l1
            // l1 l2 l3 l4
            //l2 l1 l4 l3
            //
            //
            return secondNode;

    }

}
