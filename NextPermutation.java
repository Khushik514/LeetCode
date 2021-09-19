/*
https://leetcode.com/problems/next-permutation/
*/
class Solution {
     public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //find index where ar[i] > ar[i + 1]
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        //find next larger element and swap with the i element
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //reverse array from i + 1 to last
        i = i + 1;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}