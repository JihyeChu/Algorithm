import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        if(array.length == 1){
            return array[0];
        }
        
        for(int num : array){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        
        int max = 0;
        int answer = -1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey(); // 특정숫자
            int value = entry.getValue(); // 빈도수
            
            if(value > max){
                max = value;
                answer = key;
            }else if(value == max){
                answer = -1;
            }
        }
        
        
        return answer;
    }
}