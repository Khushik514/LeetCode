/*
https://leetcode.com/problems/asteroid-collision/
*/
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids)
        {
            if(i > 0)
                st.push(i);
            else
            {
                while(st.isEmpty() == false && st.peek() > 0 && st.peek() < Math.abs(i))
                    st.pop();
                if(st.isEmpty() || st.peek() < 0)
                    st.push(i);
                else if(st.peek() == Math.abs(i))
                    st.pop();
            }
        }
        int k = st.size();
        int[] res = new int[k];
        k--;
        for(; k >= 0; k--)
            res[k] = st.pop();
        return res;
    }
}