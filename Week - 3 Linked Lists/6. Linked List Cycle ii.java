// https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        Set<ListNode> set = new HashSet<>();        
        ListNode cur = head;
        
        while(cur != null)
        {
            if(set.contains(cur))
            {
                return cur; 
            }
            set.add(cur);
            cur = cur.next;
        }
        return null;
    }
}
