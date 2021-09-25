/*
https://leetcode.com/problems/132-pattern/
*/
class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) 
            return false;
        int[] min = new int[n];
        min[0] = nums[0];
        for (int i = 1; i < n; i++) 
            min[i] = Math.min(nums[i], min[i-1]);
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 1; i--) {
            if (nums[i] > min[i-1]) {
                while (!st.isEmpty() && st.peek() <= min[i-1]) 
                    st.pop();
                if (!st.isEmpty() && st.peek() < nums[i])
                    return true;
                st.push(nums[i]);
            }
        }
        return false;
    }
}
//Didnt get it