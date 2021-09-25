/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 1)
            return n;
        int low = 0;
        for(int high = 1; high < n; high++)
        {
            if(nums[low] != nums[high])
            {
                low++;
                nums[low] = nums[high];
            }
        }
        return low + 1;
    }
}