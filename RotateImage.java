/*
https://leetcode.com/problems/rotate-image/
*/
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int s = 0, e = n - 1;
        while(s < e){
            int[] temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++; 
            e--;
        }  
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}