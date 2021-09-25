/*
https://leetcode.com/problems/search-a-2d-matrix/
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int[] i : matrix)
        {
            if(target >= i[0] && target <= i[n - 1])
            {
                if(search(i, target))
                    return true;
            }
        }
        return false;
    }
    public boolean search(int[] i, int target)
    {
        int low = 0; 
        int high = i.length - 1;
        int mid;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(i[mid] == target)
                return true;
            else if( i[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}