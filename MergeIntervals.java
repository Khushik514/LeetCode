class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        
        if(n == 0 || intervals == null) 
            return res.toArray(new int[0][]);
        
        if(n == 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int[] i : intervals) {
            if(i[0] > end) 
            {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
            else if(i[1] > end)
                end = i[1];
        }
        res.add(new int[]{start, end});
       return res.toArray(new int[0][]);
    }
}
/*
https://leetcode.com/problems/merge-intervals/
*/