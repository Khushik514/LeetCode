/*
https://leetcode.com/problems/island-perimeter/
*/
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == 1)
                {
                    perimeter = perimeter + 4;
                    if(i != 0 && grid[i - 1][j] == 1)
                        perimeter--;
                    if(j != 0 && grid[i][j - 1] == 1)
                        perimeter--;
                    if(i != row - 1 && grid[i + 1][j] == 1)
                        perimeter--;
                    if(j != col - 1 && grid[i][j + 1] == 1)
                        perimeter--;
                }
            }
        }
        return perimeter;
    }
}