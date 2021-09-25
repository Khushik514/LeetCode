/*
https://leetcode.com/problems/squares-of-a-sorted-array/
*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int[] res = new int[high + 1];
        int i = high;
        int s1, s2;
        while(low <= high)
        {
            s1 = nums[low] * nums[low];
            s2 = nums[high] * nums[high];
            if(s1 > s2)
            {
                res[i] = s1;
                low++;
            }
            else
            {
                res[i] = s2;
                high--;
            }
            i--;
        }
        return res;
    }
}