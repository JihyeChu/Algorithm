import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] arr_before = before.toCharArray();
        char[] arr_after = after.toCharArray();
        
        Arrays.sort(arr_before);
        Arrays.sort(arr_after);
        if(Arrays.equals(arr_before, arr_after)){
            return 1;
        }
        
        return 0;
    }
}