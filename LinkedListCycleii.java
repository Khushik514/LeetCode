/*
https://leetcode.com/problems/linked-list-cycle-ii/
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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
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
        return start;
    }
}