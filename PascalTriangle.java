/*
https://leetcode.com/problems/pascals-triangle/
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return res;
        for(int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            
            for(int j = 1; j <= i-1; j++) {
                List<Integer> prev = res.get(i-1);
                temp.add(prev.get(j)+ prev.get(j-1));
            }
            
            if(i > 0) temp.add(1);
            res.add(temp);
        }
        return res;
    }
}