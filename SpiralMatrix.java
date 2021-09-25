/*
https://leetcode.com/problems/spiral-matrix/
*/
class Solution {
    public List<Integer> spiralOrder(int[][] ar) {
        int r = ar.length;
        int c = ar[0].length;
        List<Integer> out = new ArrayList<>();
        int total = r * c;
        int srow = 0;
        int scol = 0;
        int erow = r;
        int ecol = c;
        int i = 0;
        int j = 0;
        while(true)
        {
            i = srow;
            j = scol;
            while(j < ecol)
            {
                out.add(ar[i][j]);
                total--;
                j++;
            }
            if(total == 0)
                break;
            j--;
            srow++;
            i++;
            while(i < erow)
            {
                out.add(ar[i][j]);
                i++;
                total--;
            }
            if(total == 0)
                break;
            i--;
            ecol--;
            j--;
            while(j >= scol)
            {
                out.add(ar[i][j]);
                total--;
                j--;
            }
            if(total == 0)
                break;
            j++;
            erow--;
            i--;
            while(i >= srow)
            {
                out.add(ar[i][j]);
                total--;
                i--;
            }
            if(total == 0)
                break;
            scol++;
        }
        return out;
    }
}