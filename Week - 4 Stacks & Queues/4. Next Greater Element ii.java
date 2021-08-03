//https://leetcode.com/problems/next-greater-element-i/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] res = new int[nums1.length];
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums2.length; i++)
        {
            int flag = 0;
            for(int j = i; j < nums2.length; j++)
            {
                if(nums2[j] > nums2[i])
                {
                    map.put(nums2[i], nums2[j]);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                map.put(nums2[i], -1);
        }
        
        int ind = 0;
        for(int i : nums1)
        {
            int cur = map.get(i);
            res[ind++] = cur;
        }
        return res;
    }
}
