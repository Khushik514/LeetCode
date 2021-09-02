/*
https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            int d = target - nums[i];
            if(hs.containsKey(d))
            {
                res[0] = hs.get(d);
                res[1] = i;
                return res;
            }
            hs.put(nums[i], i);
        }
        return res;
    }
}