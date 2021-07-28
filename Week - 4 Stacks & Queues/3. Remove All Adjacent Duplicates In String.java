//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }
        
        String res = "";
        
        while(!stack.isEmpty())
        {
            res = stack.pop() + res;
        }
        
        return res;
    }
}
