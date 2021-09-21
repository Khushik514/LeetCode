/*
https://leetcode.com/problems/sort-array-by-increasing-frequency/
*/
class Solution {
    class Pair{
        int k;
        int freq;
        Pair(int k, int freq){
            this.k=k;
            this.freq=freq;  
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int c: nums){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair> minheap=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair x, Pair y){
                if(x.freq != y.freq)
                    return x.freq-y.freq;
                else
                    return y.k - x.k;
            }
        });
        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
            minheap.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Pair rem;
        int t;
        int f;
        int k = 0;
        while(minheap.size()!=0){
            rem=minheap.poll();
            t=rem.k;
            f=rem.freq;
            for(int i=0;i<f;i++,k++)
                nums[k] = t;
        }
        return nums;     
        }
    }