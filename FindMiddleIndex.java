/*
https://leetcode.com/problems/find-the-middle-index-in-array/submissions/
*/class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int i = 0;
        for(; i < n; i++)
            sum = sum + nums[i];
        int x = -1;
        int sum2 = 0;
        i--;
        for(; i >= 0; i--)
        {
            sum = sum - nums[i];
            if(sum == sum2)
                x = i;
            sum2 = sum2 + nums[i];
        }
        return x;
    }
}