/*
https://leetcode.com/problems/add-two-numbers/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        
        if(l2 == null)
            return l1;
        
        ListNode head = new ListNode();
        ListNode current = head;
        int carry = 0;
        while(l1 != null || l2 != null) {
            
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            
            int sum = val1 + val2 + carry;
            
            if(sum >= 10) {
                current.next = new ListNode(sum%10);
                carry = 1;
            } else {
                current.next = new ListNode(sum);
                carry = 0;
            }
            
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            current = current.next;            
        }
        
        if(carry == 1) {
            current.next = new ListNode(1);
        }
        return head.next;
    }
}