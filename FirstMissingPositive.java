/*
https://leetcode.com/problems/first-missing-positive/
*/
class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) 
            return 1;
        int n = nums.length;
        int d;
        for(int i = 0; i< n;)
        {
            d = nums[i];
            //negative + greater than n skip
            if (nums[i] > n || nums[i] <= 0) 
                i++;
            //correct position skip
            else if (nums[d - 1] == d)
                i++;
            //swap to correct position i.e. 2 at index 1, 1 at index 0, 3 at index 2
            else  
            {
                nums[i] = nums[d - 1];
                nums[d - 1] = d;
            }
        }
        int i = 0;
        for(i = 0; i < n; i++)
        {
            //find first occurence of mismatch
            if(nums[i] != i + 1) 
                return i+1;
        }
        return nums[i-1] + 1;
    }
}