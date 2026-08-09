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
    public void reorderList(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = fast;

        while(curr != null)
        {
            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }
        fast = prev;
        while (fast != null) {

         ListNode firstNext = head.next;
         ListNode secondNext = fast.next;

        head.next = fast;
        fast.next = firstNext;

        head = firstNext;
        fast = secondNext;
        
        }
        
    }
}