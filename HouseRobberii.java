/*
https://leetcode.com/problems/house-robber-ii/
*/
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }
    
    public int helper(int[] nums, int start, int end) {
        int max = 0;
        int rob = 0;
        int notRob = 0;
        for (int i =  start; i <= end; i++) {
        	max = Math.max(rob + nums[i], notRob);
        	rob = notRob;
        	notRob = max;
        }
        return max;
    }
}
//Didn't understand this one