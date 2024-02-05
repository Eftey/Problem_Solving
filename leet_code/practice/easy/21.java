/*
    Problem: Merge Two Sorted Lists
    1) Create an istance of both list
    2) Check which list has the lower values
    3) And add that value to the new list
    4) After the end of the loop we'd still be leaving with the last value
    5) In order to get that value we have to check where it is and finally add it to the new list manually
    6) Then return the new list
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(), x = list1, y = list2, head = listNode;
        if (list1 == null) return list2;
        else if (list2 == null) return list1;

        while (x != null && y != null) {
            if (x.val <= y.val) {
                listNode.next = x;
                x = x.next;
            } else {
                listNode.next = y;
                y = y.next;
            }
            listNode = listNode.next;
        }
        if (x == null) listNode.next = y;
        if (y == null) listNode.next = x;
        return head.next;
    }
}