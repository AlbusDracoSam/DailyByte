//https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 == 1)
            return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(!stack.isEmpty())
                {
                    char top = stack.pop();
                    if(c == ')' && top == '(')
                        continue;
                    else if(c == ']' && top == '[')
                        continue;
                    else if(c == '}' && top == '{')
                        continue;
                    else 
                        return false;
                }
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
