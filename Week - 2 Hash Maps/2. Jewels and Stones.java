//https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        int res = 0 ;
        
        for(char c : stones.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        for(char c : jewels.toCharArray())
        {
            if(map.containsKey(c))
            {
                res += map.get(c);
            }
        }
        return res;
    }
}
