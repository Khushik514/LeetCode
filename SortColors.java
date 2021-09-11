/*
https://leetcode.com/problems/sort-colors/
*/
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int i, t;
        while(mid <= high)
        {
            i = nums[mid];
            if(i == 0)
            {
                t = nums[low];
                nums[low] = i;
                nums[mid] = t;
                low++;
                mid++;
            }
            else if(i == 1)
                mid++;
            else
            {
                t = nums[high];
                nums[high] = i;
                nums[mid] = t;
                high--;
            }
        }
    }
}