/*
https://leetcode.com/problems/score-of-parentheses/submissions/
*/
class Solution {
    public int scoreOfParentheses(String s) {
        int max = 0;
        int x = 0;
        char ch;
        for(int i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch == '(')
                x++;
            else
            {
                x--;
                if(s.charAt(i - 1) == '(')
                    max += 1 << x;
            }
        }
        return max;
    }
}