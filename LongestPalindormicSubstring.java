/*
https://leetcode.com/problems/longest-palindromic-substring/
*/
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1)
            return s;
        int low = 0, high = 0;
        int l, l2, len;
        for(int i = 0; i < n - 1; i++)
        {
            l = expandAroundCentre(s, i, i, n);
            l2 = expandAroundCentre(s, i, i + 1, n);
            len = Math.max(l, l2);
            if(len > high - low)
            {
                low = i - (len - 1) / 2;
                high = i + len / 2;
            }
        }
        return s.substring(low, high + 1);
    }
    public int expandAroundCentre(String s, int left, int right, int n)
    {
        while(left >= 0 && right < n && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right - left - 1;
    }
}