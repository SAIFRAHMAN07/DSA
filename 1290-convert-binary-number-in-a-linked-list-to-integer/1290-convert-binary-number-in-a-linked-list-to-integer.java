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
    public int getDecimalValue(ListNode head) 
    {
        ListNode temp = head;
        ListNode temp1 = head;
        int count=0;
        int sum=0;

        while(temp!=null)
        {
            count++;
            temp= temp.next;
        }
        count--;
        while(temp1!=null)
        {
            sum +=  temp1.val* Math.pow(2,count);
            temp1 = temp1.next;
            count--; 
        }
        return sum;
    }
}