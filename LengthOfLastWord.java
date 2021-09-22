/*
https://leetcode.com/problems/length-of-last-word/
*/
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int len = 0;
        while(i >= 0 && s.charAt(i) == ' ')
            i--;
        while(i >= 0 && s.charAt(i) != ' ')
        {
            i--;
            len++;
        }
        return len;
    }
}