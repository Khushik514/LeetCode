/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
*/
class Solution {
    public int search(int[] A, int target) {
        int lo = 0;
        int hi = A.length - 1;
        int mid, d;
        while (lo <= hi) 
        {
            mid = (lo + hi) / 2;
            d = A[mid];
            if (d == target) 
                return mid;
            if (A[lo] <= d) 
            {
                if (target >= A[lo] && target < d)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            else 
            {
                if (target > d && target <= A[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}