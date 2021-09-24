/*
https://leetcode.com/problems/subarray-product-less-than-k/
*/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) 
            return 0;
        int count = 0;
        int left = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            while (prod >= k) {
                prod = prod / nums[left++];
            }
            count = count + i - left + 1;
        }
        return count;
    }
}