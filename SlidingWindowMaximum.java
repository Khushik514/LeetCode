/*
https://leetcode.com/problems/sliding-window-maximum/
*/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        if(n == 0 || k == 0)
            return new int[0];
        int[] res = new int[n - k + 1];
        for(int i = 0; i < n; i++)
        {
            while(dq.isEmpty() == false && dq.peekFirst() <= i - k)
                dq.pollFirst();
            while(dq.isEmpty() == false && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.offerLast(i);
            if(i >= k - 1)
                res[i - k + 1] = nums[dq.peekFirst()];
        }
        return res;
    }
}