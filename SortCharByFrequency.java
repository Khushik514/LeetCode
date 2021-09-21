/*
https://leetcode.com/problems/sort-characters-by-frequency/
*/
class Solution {
    class Pair{
        char k;
        int freq;
        Pair(char k, int freq){
            this.k=k;
            this.freq=freq;  
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer>map=new HashMap<>();
        char a[]=s.toCharArray();
        for(char c: a){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair>maxheap=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair x, Pair y){
                return y.freq-x.freq;
            }
        });
        for(Map.Entry<Character, Integer>entry: map.entrySet()){
            maxheap.add(new Pair(entry.getKey(), entry.getValue()));
        }
        StringBuilder sb=new StringBuilder();
        Pair rem;
        char t;
        int f;
        while(maxheap.size()!=0){
            rem=maxheap.poll();
            t=rem.k;
            f=rem.freq;
            for(int i=0;i<f;i++){
                sb.append(t);
            }  
        }
        return sb.toString();     
        }
    }