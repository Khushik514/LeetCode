/*
https://leetcode.com/problems/merge-sorted-array/
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int e1, e2;
        m--;
        n--;
        for(int i = m + n + 1; i >= 0; i--)
        {
            e1 = m >= 0 ? nums1[m] : Integer.MIN_VALUE;
            e2 = n >= 0 ? nums2[n] : Integer.MIN_VALUE;
            if(e1 >= e2)
            {
                nums1[i] = e1;
                m--;
            }
            else
            {
                nums1[i] = e2;
                n--;
            }
        }
    }
}