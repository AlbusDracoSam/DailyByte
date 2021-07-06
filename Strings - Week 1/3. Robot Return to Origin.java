//https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        
        int UD = 0 ;
        int LR = 0;
        
        for(int i = 0 ; i < moves.length(); i++)
        {
            char c = moves.charAt(i);
            if(c == 'U')
                UD++;
            else if(c == 'D')
                UD--;
            else if(c == 'L')
                LR--;
            else 
                LR++;
        }
        if(LR == 0 && UD == 0)
            return true;
        
        return false;
    }
}
