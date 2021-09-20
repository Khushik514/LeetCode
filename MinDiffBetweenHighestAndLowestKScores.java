/*
https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
*/
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k == 1 || nums.length == 1)
            return 0;
        Arrays.sort(nums);
        int d;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i + k - 1 < nums.length; i++)
        {
            d = nums[i + k - 1] - nums[i];
            if(d < min)
                min = d;
        }
        return min;
    }
}