/*
https://leetcode.com/problems/maximum-product-subarray/
*/
class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0], min = 1, max = 1;
        int temp;
        int d;
        for(int i = 0; i < nums.length; i++)
        {
            d = nums[i];
            temp = max * d;
            max = Math.max(d, Math.max(max * d, min * d));
            min = Math.min(temp, Math.min(d, d * min));
            res = Math.max(res, max);
        }
        return res;
    }
}