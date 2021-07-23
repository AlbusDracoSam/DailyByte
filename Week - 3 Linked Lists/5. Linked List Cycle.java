//https://leetcode.com/problems/linked-list-cycle/

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        Set<ListNode> set = new HashSet<>();
        
        ListNode cur = head;
        
        while(cur != null)
        {
            if(set.contains(cur))
                return true;
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
