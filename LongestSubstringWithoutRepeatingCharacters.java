/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0 || n == 1)
            return n;
        int result = 0;
        int[] cache = new int[256];
        for (int i = 0, j = 0; i < n; i++) {
            j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
            cache[s.charAt(i)] = i + 1;
            result = Math.max(result, i - j + 1);
            if(result == n)
                break;
        }
        return result;
    }
}