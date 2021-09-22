/*
https://leetcode.com/problems/move-zeroes/
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int low = 0;
        int d;
        for(int i = 0; i < nums.length; i++)
        {
            d = nums[i];
            if(d != 0)
                nums[low++] = d;   
        }
        for(; low < nums.length; low++)
            nums[low] = 0;
    }
}