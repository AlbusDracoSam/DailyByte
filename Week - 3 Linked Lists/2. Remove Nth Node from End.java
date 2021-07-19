//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int size = 0;
        
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        
        ListNode cur = head;
        
        while(cur != null)
        {
            size++;
            cur = cur.next;
        }
        int i = size - n; 
        cur = dummy;
        while(i > 0)
        {
            i--;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        
        return dummy.next;
    }
}
