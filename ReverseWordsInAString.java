/*
https://leetcode.com/problems/reverse-words-in-a-string/
*/
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        int j;
        while(i >= 0)
        {
            if(s.charAt(i) == ' ')
                i--;
            else
            {
                j = i;
                while(i >= 0 && s.charAt(i) != ' ')
                    i--;
                if(sb.length() > 0)
                    sb.append(" ");
                /*for(int k = i + 1; k <= j; k++)
                    sb.append(s.charAt(k));*/
                sb.append(s.substring(i + 1, j + 1));
            }
        }
        return sb.toString();
    }
}