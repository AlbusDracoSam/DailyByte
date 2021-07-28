//https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        if(s.equals(t))
            return true;
        
        return backSpace(s).equals(backSpace(t));
        
    }
    
    public String backSpace(String s)
    {
        Stack<Character> stack = new Stack();
        
        for(char c : s.toCharArray())
        {
            if(c != '#')
                stack.push(c);
            
            else if(!stack.isEmpty())
                stack.pop();
        }
        
        return String.valueOf(stack);
        
    }
    
}
