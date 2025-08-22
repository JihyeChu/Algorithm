import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> map = new  LinkedHashMap<>();
        
        for(int i=0; i<numlist.length; i++){
            int num = Math.abs(n-numlist[i]);
            map.put(numlist[i], num);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int dist1 = map.get(o1);
                int dist2 = map.get(o2);
                if(dist1 == dist2){
                    return o2-o1;
                }
            	return dist1 - dist2;
            }
        });
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
            
        return answer;
    }
}