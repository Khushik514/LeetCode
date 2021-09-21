/*
https://leetcode.com/problems/decode-string/
*/
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder temp = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int repeats;
        char c;
        for (int i=0; i<n; ++i){
            c = s.charAt(i);
            if (Character.isDigit(c)){
                int num = c-'0';
                while (i+1 < n && Character.isDigit(s.charAt(i+1))){
                    num = num*10 + s.charAt(i+1)-'0';
                    i++;
                }
                numStack.push(num);
            }
            else if (c == '[') {
                strStack.push(sb);
                sb = new StringBuilder();
            }
            else if (c == ']'){
                repeats = numStack.pop();
                temp = strStack.pop();
                for (int j=0; j < repeats; ++j){
                    temp.append(sb);
                }
                sb = temp;
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }
}