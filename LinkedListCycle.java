/*
https://leetcode.com/problems/linked-list-cycle/
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode curr = head;
        ListNode curr2 = head;
        ListNode start = null;
        while(curr2 != null && curr2.next != null)
        {
            curr = curr.next;
            curr2 = curr2.next.next;
            if(curr == curr2)
            {
                start = head;
                while(curr != start)
                {
                    start = start.next;
                    curr = curr.next;
                }
                break;
            }
        }
        if(start == null)
            return false;
        else
            return true;
    }
}