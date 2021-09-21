/*
https://leetcode.com/problems/repeated-dna-sequences/
*/
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> subs = new HashSet<>();
        List<String> res = new ArrayList<>();
        String ss;
        for(int i = 0; i <= s.length() - 10; i++)
        {
            ss = s.substring(i, i + 10);
            if(subs.contains(ss) && res.contains(ss) == false)
                res.add(ss);
            subs.add(ss);
        }
        return res;
    }
}