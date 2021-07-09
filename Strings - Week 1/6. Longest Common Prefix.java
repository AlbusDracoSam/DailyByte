//https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        if(strs.length == 0) return "";  // if the array is empty: return ""
        if(strs.length == 1) return strs[0]; // if there is only 1 element: return the 1st element;
        String prefix = strs[0]; //assume the 1st element is the prefix and reduce it till you obtain the prefix;
			   
       // for each element in the array starting from the 2nd element
        for(int i=1;i<strs.length;i++){ 
            // if the element doesn't start with the prefix, remove the last element of the prefix 
            while(!strs[i].startsWith(prefix)){ 
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
