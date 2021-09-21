/*
https://leetcode.com/problems/word-break/
*/
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> set = new HashSet<String>();
        int max = 0;
        for(String word : wordDict)
        {
            set.add(word);
            max = Math.max(max, word.length());
        }
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(i - j > max)
                    continue;
                if(dp[j] && set.contains(s.substring(j, i)))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}