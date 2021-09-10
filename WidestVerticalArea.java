/*

*/
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] point = new int[points.length];
        for(int i = 0; i < points.length; i++)
            point[i] = points[i][0];
        int max = 0;
        Arrays.sort(point);
        for(int i = 0; i < point.length - 1; i++)
        {
            max = Math.max(max, point[i + 1] - point[i]);
        }
        return max;
    }
}