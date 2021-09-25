/*
https://leetcode.com/problems/group-anagrams/
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        char[] c;
        String key;
        for(String s : strs)
        {
            c = s.toCharArray();
            Arrays.sort(c);
            key = String.valueOf(c);
            if(hm.containsKey(key) == false)
                hm.put(key, new ArrayList<>());
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}