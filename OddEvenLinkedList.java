/*
https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode res = new ListNode();
        ListNode cures = res;
        ListNode curr = head;
        while(curr != null)
        {
            cures.next = new ListNode(curr.val);
            cures = cures.next;
            curr = curr.next;
            if(curr == null)
                break;
            curr = curr.next;
        }
        curr = head.next;
        while(curr != null)
        {
            cures.next = new ListNode(curr.val);
            cures = cures.next;
            curr = curr.next;
            if(curr == null)
                break;
            curr = curr.next;
        }
        return res.next;
    }
}