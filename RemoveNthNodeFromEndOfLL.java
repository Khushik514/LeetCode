/*
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int k = 0;
        ListNode curr = head;
        while(curr != null && k < n)
        {
            k++;
            curr = curr.next;
        }
        if(k == n && curr == null)
            return head.next;
        if(curr == null)
            return null;
        ListNode curr2 = head;
        while(curr.next != null)
        {
            curr = curr.next;
            curr2 = curr2.next;
        }
        curr2.next = curr2.next.next;
        return head;
    }
}