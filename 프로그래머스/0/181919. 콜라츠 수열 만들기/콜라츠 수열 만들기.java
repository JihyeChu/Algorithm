import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> results = new ArrayList<>();
        results.add(n);
        
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = 3 * n + 1;
            }
            results.add(n); 
        }
        
        return results.stream().mapToInt(i -> i).toArray();
    }
}