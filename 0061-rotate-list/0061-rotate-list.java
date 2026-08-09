class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;

        ListNode tail = head;
        int n = 1;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        k = k % n;

        if (k == 0)
            return head;

        tail.next = head;

        ListNode curr = head;

        for (int i = 1; i < n - k; i++) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;

        curr.next = null;

        return newHead;
    }
}