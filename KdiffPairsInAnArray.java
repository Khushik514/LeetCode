/*
https://leetcode.com/problems/k-diff-pairs-in-an-array/
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i : nums)
        {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry e : hs.entrySet())
        {
            if(k == 0)
            {
                if((int)e.getValue() >= 2)
                    count++;
            }
            else 
            {
                if(hs.containsKey((int)e.getKey() + k))
                    count++;
            }
        }
        return count;
    }
}