import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        
        StringBuffer sb = new StringBuffer();
        HashSet<Character> hs = new HashSet<>();
        
        for(char value : my_string.toCharArray()) {
            if(hs.add(value)){
                sb.append(value);
            }
             
        }
        
        return sb.toString(); 
    }
}