/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 1)
            return n;
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;
        char ch;
        int i = 0, j = 0;
        while(j < n)
        {
            ch = s.charAt(j);
            if(hm.containsKey(ch))
                i = Math.max(hm.get(ch), i);
            ans = Math.max(ans, j - i + 1);
            j++;
            hm.put(ch, j);
        }
        return ans;
    }
}