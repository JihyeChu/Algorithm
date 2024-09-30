import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(5);
        
        while(!queue.isEmpty()){
            int num = queue.poll();
            
            if(num >= l && num <= r){
                result.add(num);
            }
            
            if(num * 10 > r){
                continue;
            }
            
            queue.offer(num * 10);
            queue.offer(num * 10 + 5);
        }
        
        if(result.isEmpty()){
            return new int[]{-1};
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}