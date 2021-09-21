/*
https://leetcode.com/problems/sort-colors/
*/
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        int curr;
        while(mid <= high)
        {
            curr = nums[mid];
            if(curr == 0)
            {
                nums[mid] = nums[low];
                nums[low] = curr;
                low++;
                mid++;
            }
            else if(curr == 1)
                mid++;
            else
            {
                nums[mid] = nums[high];
                nums[high] = curr;
                high--;
            }
        }
    }
}