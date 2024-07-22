import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String str = String.valueOf(i);
            str = str.replace("5","").replace("0","");
            if("".equals(str)){
                result.add(i);
            }
        }
        return result.size() > 0 ? 
            result.stream().mapToInt(i -> i).toArray() : new int[]{-1};
        
    }
}