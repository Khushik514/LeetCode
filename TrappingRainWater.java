/*
https://leetcode.com/problems/trapping-rain-water/
*/
//Easy Understandable Solution
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        leftmax[0] = height[0];
        int res = 0;
        for(int i = 1; i < n; i++)
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        rightmax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--)
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        for(int i = 0; i < n; i++)
            res = res + (Math.min(leftmax[i], rightmax[i]) - height[i]);
        return res;
    }
}
//Best Solution
class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] <= height[right]) {
                int current = left;
                while (height[++left] < height[current]) {
                    ans += height[current] - height[left];
                } 
            } else {
                int current = right;
                while (height[--right] < height[current]) {
                    ans += height[current] - height[right];
                }
            }
        }
        return ans;
    }
}