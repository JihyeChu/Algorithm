class Solution {
    public String solution(String s) {
        int[] count = new int[26];
        
        // 문자 개수 세기
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        // count 배열 순회
        for(int i=0; i<count.length; i++){
            if(count[i] == 1){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}