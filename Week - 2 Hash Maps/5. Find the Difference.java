//https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        
        for(char c : s.toCharArray())
        {
            smap.put(c, smap.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray())
        {
            tmap.put(c, tmap.getOrDefault(c, 0)+1);
        }
        for(char key : tmap.keySet())
        {
            if(!smap.containsKey(key))
                return key;
            if(!tmap.get(key).equals(smap.get(key)))
                return key;
        }
        return ' ';
    }
}
