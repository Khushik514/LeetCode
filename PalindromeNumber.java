/*
https://leetcode.com/problems/palindrome-number/
*/
class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int xx = x;
        while(xx != 0)
        {
            res = res * 10 + xx % 10;
            xx = xx / 10;
        }
        if(res == x && x >= 0)
            return true;
        else
            return false;
    }
}