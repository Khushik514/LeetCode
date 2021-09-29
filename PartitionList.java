/*
https://leetcode.com/problems/partition-list/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return null;
        ListNode newhead = new ListNode(0);
        ListNode curr = newhead;
        ListNode newhead2 = new ListNode(0);
        ListNode curr2 = newhead2;
        while(head != null)
        {
            if(head.val < x)
            {
                curr.next = head;
                curr = curr.next;
            }
            else
            {
                curr2.next = head;
                curr2 = curr2.next;
            }
            head = head.next;
        }
        curr2.next = null;
        curr.next = newhead2.next;
        return newhead.next;
    }
}