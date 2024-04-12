package com.techelevator.leetcode;

import java.util.List;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode prehead = new ListNode(-1); //dummy value to create a new ListNode
//        ListNode cur = prehead; //current set do our new ListNode
//
//        while (l1 != null && l2 != null) { //while both lists are not null
//            if (l1.val <= l2.val) {
//                cur.next = l1; //if l1.val is less or equal to l2.val cur.next equals l1
//                l1 = l1.next; //move pointer to the next node in l1
//            } else {
//                cur.next = l2; //if l2.val i greater, cur.next equals l2
//                l2 = l2.next; //move pointer to next node in l2
//            }
//            cur = cur.next; //move pointer to next node in cur
//        }
//
//        cur.next = l1 == null ? l2 : l1; //if l1 is null, cur.next equals l2, else cur.next equals l1
//        return prehead.next; //return the next node of prehead

        ListNode prehead = new ListNode(-1);
        ListNode current = prehead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
