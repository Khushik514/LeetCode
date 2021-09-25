/*
https://leetcode.com/problems/remove-covered-intervals/
*/
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n <= 1)
            return n;
        Arrays.sort(intervals ,new Comparator<int[]>(){
            public int compare(int[] i1,int[] i2)
            {
                if(i1[0] == i2[0])
                    return i2[1] - i1[1];
                else
                    return i1[0] - i2[0];
            }
        });
        int e = intervals[0][1];
        int count = 0;
        int y;
        //a and c to hain hi sorted, bs ends check krne hain
        for(int i = 1; i < n; i++)
        {
            y = intervals[i][1];
            if(y <= e)
                count++;
            else
                e = y;
        }
        return n - count;
    }       
}