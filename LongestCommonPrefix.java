/*
https://leetcode.com/problems/longest-common-prefix/
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i;
        String res = strs[0];
        while(res.length() > 0)
        {
            i = 1;
            for(; i < strs.length; i++)
            {
                if(strs[i].startsWith(res))
                    continue;
                else
                    break;
            }
            if(i == strs.length)
                break;
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }
}