class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i : nums)
        {
            sum = sum + i;
            max = max < sum ? sum : max;
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
/*
https://leetcode.com/problems/maximum-subarray/
This question is basically using Kadane's Algorithm.
*/