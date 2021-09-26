/*
https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode curr1, ListNode curr2) {
        if(curr1 == null)
            return curr2;
        if(curr2 == null)
            return curr1;
        ListNode newhead = new ListNode();
        ListNode curr = newhead;
        while(curr1 != null && curr2 != null)
        {
            if(curr1.val < curr2.val)
            {
                curr.next = new ListNode(curr1.val);
                curr1 = curr1.next;
            }
            else
            {
                curr.next = new ListNode(curr2.val);
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        while(curr1 != null)
        {
            curr.next = new ListNode(curr1.val);
            curr = curr.next;
            curr1 = curr1.next;
        }
        while(curr2 != null)
        {
            curr.next = new ListNode(curr2.val);
            curr = curr.next;
            curr2 = curr2.next;
        }
        return newhead.next;
    }
}