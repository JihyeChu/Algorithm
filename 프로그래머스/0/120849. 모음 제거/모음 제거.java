class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] word = {'a', 'e', 'i', 'o', 'u'};
        
        for(char my : my_string.toCharArray()){
            boolean flag = false;
            for(char w : word){
                if(my == w){
                    flag = true;
                }
            }
            if(flag == false) answer += my;
        }
        
        return answer;
    }
}