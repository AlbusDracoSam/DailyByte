// https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1)
        {
            set1.add(i);
        }
        for(int i : nums2)
        {
            set2.add(i);
        }
               
        List<Integer> list = new ArrayList();
        for(int i : set2)
        {
            if(set1.contains(i))
                list.add(i);
        }
        
        int[] res = new int[list.size()];
        int ind = 0;
        for(int i : list)
        {
            res[ind++] = i;
        }
        return res;   
    }
}
