/*
https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
*/
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] count = new int[7];
        int[] counttop = new int[7];
        int[] countbot = new int[7];
        int n = tops.length;
        int top, bot;
        for(int i = 0; i < n; i++)
        {
            top = tops[i];
            bot = bottoms[i];
            if(top != bot)
            {
                count[top]++;
                count[bot]++;
            }
            else
                count[top]++;
            counttop[top]++;
            countbot[bot]++;
        }
        for(int i = 1; i <= 6; i++)
        {
            if(count[i] >= n)
            {
                return Math.min(n - counttop[i], n - countbot[i]);
            }
        }
        return -1;
    }
}