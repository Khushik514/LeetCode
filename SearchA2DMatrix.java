/*
https://leetcode.com/problems/search-a-2d-matrix/
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col = n - 1;
        int row = 0;
        int x;
        while(col >= 0 && row <= m - 1) {
            x = matrix[row][col];
            if(target == x)
                return true;
            else if(target < x)
                col--;
            else
                row++;
        }
        return false;
    }
}