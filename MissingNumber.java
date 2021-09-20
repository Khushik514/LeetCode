/*
https://leetcode.com/problems/missing-number/
*/
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int calcSum = 0;
        for (int num : nums) {
            sum = sum - num;
        }
        return sum;
    }
}