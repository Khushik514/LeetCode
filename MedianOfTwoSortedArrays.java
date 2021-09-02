/*
https://leetcode.com/problems/median-of-two-sorted-arrays/
*/class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        int i1 = 0;
        int i2 = 0;
        int i = 0;
        while (i1 < m && i2 < n) {
            if (nums1[i1] < nums2[i2]) {
                nums[i] = nums1[i1];
                i1 += 1;
            } else {
                nums[i] = nums2[i2];
                i2 += 1;
            }
            i += 1;
        }
        while (i1 < m) {
            nums[i++] = nums1[i1++];
        }
        while (i2 < n) {
            nums[i++] = nums2[i2++];
        }
        int mid = (m + n - 1) / 2;
        if ((m + n) % 2 != 0) {
            return (double)nums[mid];
        } else {
            return ((double)nums[mid] + (double)nums[mid + 1]) / 2;
        }
    }
}