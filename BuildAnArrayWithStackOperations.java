/*
https://leetcode.com/problems/build-an-array-with-stack-operations/
*/
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int k = 1;
        List<String> res = new ArrayList<>();
        for(int i = 0; i < target.length;)
        {
            if(target[i] != k)
            {   
                res.add("Push");
                res.add("Pop");
            }
            else
            {
                res.add("Push");
                i++;
            }
            k++;
        }
        return res;
    }
}