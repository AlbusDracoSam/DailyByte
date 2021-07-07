//https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.length() == 1)
            return true;
        
        int n = word.length();
        
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)))
        {
            for(int i = 2; i < n; i++)
            {
                if(!Character.isUpperCase(word.charAt(i)))
                    return false;
            }
        }
        else
        {
            for(int i = 1; i < n; i++)
            {
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
        }
        
       return true; 
    }
}
