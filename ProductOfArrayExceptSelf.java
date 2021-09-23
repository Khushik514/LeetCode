/*
https://leetcode.com/problems/product-of-array-except-self/
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int product = 1;
        res[0] = 1;
        //array initialized with usse pehle ke items ka product
        for(int i = 1; i < n; i++)
            res[i] = res[i - 1] * nums[i - 1];
        //array multiplied with usse baad ke items ka product
        for(int i = n - 1; i >= 0; i--)
        {
            res[i] = res[i] * product;
            product = product * nums[i];
        }
        return res;     
    }
}