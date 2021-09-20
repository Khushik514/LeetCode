/*
https://leetcode.com/problems/reverse-words-in-a-string/
*/
class Solution {
    public String reverseWords(String s) {
        String[] ar = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = ar.length - 1; i >= 0; i--)
            sb.append(ar[i] + " ");
        return sb.toString().trim();
    }
}