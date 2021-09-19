/*
https://leetcode.com/problems/middle-of-the-linked-list/
*/
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr1 = head;
        ListNode curr2 = head;
        while(curr2 != null && curr2.next != null)
        {
            curr1 = curr1.next;
            curr2 = curr2.next.next;
        }
        return curr1;
    }
}