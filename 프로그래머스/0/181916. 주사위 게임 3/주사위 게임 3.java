import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> counts = new HashMap<>();
        
        for(int num : new int[]{a, b, c, d}){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int n = counts.size(); // 키의 가지 수
        
        if(n==1){
            return 1111 * a;
        }else if(n == 2){ // 3-1, 2-2
            for(int v : counts.values()){
                if(v == 3){
                    int p=0, q=0;
                    for(int key : counts.keySet()){
                        if(counts.get(key) == 3) p = key;
                        else q = key;
                    }
                    return (int)Math.pow(10*p + q, 2);
                }
            }
            Integer[] keys = counts.keySet().toArray(new Integer[0]);
            return ((keys[0] + keys[1]) * Math.abs(keys[0]-keys[1]));
        }else if(n==3){
            int p=0, q=0, r=0;
            for(int key : counts.keySet()){
                if(counts.get(key) == 2) p = key;
                else if(q == 0) q = key;
                else r = key;
            }
            return q * r;
        }else {
            return Math.min(Math.min(a,b),Math.min(c,d));
        }
        
    }
}