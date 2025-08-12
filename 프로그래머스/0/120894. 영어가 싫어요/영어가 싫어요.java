import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int i = 0;
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        StringBuilder sb = new StringBuilder();
        while(i < numbers.length()){
            for(String key : map.keySet()){
                if(numbers.startsWith(key, i)){
                    sb.append(map.get(key));
                    i += key.length();
                    break;
                }
            }
        }
        
        return Long.parseLong(sb.toString());
    }
}