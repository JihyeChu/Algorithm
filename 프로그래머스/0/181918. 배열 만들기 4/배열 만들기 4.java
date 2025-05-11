import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> results = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if (results.isEmpty()) {
               results.add(arr[i]);
            }else if(results.get(results.size()-1) >= arr[i]){
                results.remove(results.size()-1);
                i--;
            }else if(results.get(results.size()-1) < arr[i]){
                results.add(arr[i]);
            }     
        }
        
        return results.stream().mapToInt(cnt -> cnt).toArray();
    }
}