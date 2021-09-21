/*
https://leetcode.com/problems/valid-parentheses/
*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        char ch;
        for(int i = 0; i < n; i++)
        {
            ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else
            {
                if(st.isEmpty())
                    return false;
                if(checkequal(st.pop(), ch))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
    public boolean checkequal(char ch, char ch2)
    {
        if(ch == '(')
        {
            if(ch2 == ')')
                return true;
            return false;
        }
        if(ch == '[')
        {
            if(ch2 == ']')
                return true;
            return false;
        }
        if(ch == '{')
        {
            if(ch2 == '}')
                return true;
            return false;
        }
        return false;
    }
}