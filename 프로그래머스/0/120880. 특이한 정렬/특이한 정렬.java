import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(nums, (a, b) -> {
            int dist1 = Math.abs(a - n);
            int dist2 = Math.abs(b - n);
            
            if(dist1 == dist2){
                return b - a; // 거리가 같으면 더 큰 수 먼저
            }
            return dist1 - dist2; // 더 작은 거리가 먼저
        });
        
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
}