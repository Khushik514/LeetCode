/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        int mid;
        while(low < high)
        {
            mid = (low + high) / 2;
            if(nums[mid] < nums[high])
                high = mid;
            else if(nums[mid] > nums[high])
                low = mid + 1;
            else
                high--;
        }
        return nums[high];
    }
}