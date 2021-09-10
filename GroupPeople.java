/*
https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
*/
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupsizes) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        int n = groupsizes.length;
        for(int i = 0 ; i<n ; i++) {
            if(groupsizes[i] != -1) {
                List<Integer> count = new ArrayList<Integer>();
                
                int x = groupsizes[i];
                int temp = x;
                for(int j = i ; j<n ; j++) {
                    if(x == 0) {
                        break;
                    }
                    
                    if(groupsizes[j] == temp) {
                        count.add(j);
                        groupsizes[j] = -1;
                        x--;
                    } 
                    
                }
                ans.add(count);
            }
        }
        return ans;
    }
}