/*
https://leetcode.com/problems/valid-perfect-square/
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        long mid;
        while(left <= right)
        {
            mid = (left + right) / 2;
            if(mid * mid == num)
                return true;
            else if(mid * mid < num)
                left = (int)(mid + 1);
            else
                right = (int)(mid - 1);
        }
        return false;
    }
}