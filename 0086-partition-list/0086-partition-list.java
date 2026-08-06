class Solution {
    public ListNode partition(ListNode head, int x) 
    {
        ListNode sdummy = new ListNode(0);
        ListNode ldummy = new ListNode(0);

        ListNode small = sdummy;
        ListNode large = ldummy;
        ListNode temp = head;

        while(temp!=null)
        {
            if(temp.val<x)
            {
                small.next = temp;
                small = small.next;
            }
            else
            {
                large.next = temp;
                large = large.next;
            }
            temp = temp.next;
        }
        large.next = null;
        small.next =ldummy.next;

        return sdummy.next;
        
    }
}
