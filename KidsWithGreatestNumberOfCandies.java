/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        for(int i : candies)
            max = Math.max(max, i);
        for(int i = 0; i < candies.length; i++)
        {
            if((extraCandies + candies[i]) >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}