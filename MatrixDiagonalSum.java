/*
https://leetcode.com/problems/matrix-diagonal-sum/
*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++)
        {
            res = res + mat[i][i] + mat[i][n - i - 1];
        }
        if(n % 2 == 1)
            res = res - mat[n / 2][n / 2];
        return res;
    }
}