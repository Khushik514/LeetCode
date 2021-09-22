/*
https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int d = target - nums[i];
            if(hs.containsKey(d))
                return new int[]{hs.get(d), i};
            hs.put(nums[i], i);
        }
        return new int[2];
    }
}