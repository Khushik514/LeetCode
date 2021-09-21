/*
https://leetcode.com/problems/valid-anagram/
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int o = t.length();
        if(n != o)
            return false;
        int i;
        char ch, ch2;
        int[] count = new int[26];
        for(i = 0; i < n; i++)
        {
            ch = s.charAt(i);
            count[ch - 'a']++;
        }
        for(i = 0; i < o; i++)
        {
            ch2 = t.charAt(i);
            count[ch2 - 'a']--;
        }
        for(i = 0; i < 26; i++)
        {
            if(count[i] != 0)
                return false;
        }
        return true;
    }
}