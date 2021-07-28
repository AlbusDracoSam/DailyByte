//https://leetcode.com/problems/reverse-linked-list/

class Solution {
    public ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack();
        
        while(head != null)
        {
            stack.push(head);
            head = head.next;
        }
        
        ListNode dummy = new ListNode(-1);
        head = dummy ;
        
        while(!stack.isEmpty())
        {
            ListNode cur = stack.pop();
            head.next = new ListNode(cur.val) ;
            head = head.next ;
        }
        
        return dummy.next ;
    }
}
