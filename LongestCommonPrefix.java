/*
https://leetcode.com/problems/longest-common-prefix/
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String res = strs[0];
        int n = res.length();
        for(int i = 1; i < strs.length; i++)
        {
            while(strs[i].indexOf(res) != 0)
            {
                res = res.substring(0, n - 1);
                n--;
                if(n == 0)
                    return "";
            }
        }
        return res;
    }
}