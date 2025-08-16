class Solution {
    public String[] solution(String my_str, int n) {
        int share = my_str.length()/n;
        int rest = my_str.length()%n;
        int num = 0;
        String[] answer = new String[share + (rest > 0 ? 1 : 0)];

        for(int i=0; i<share; i++){
            answer[i] = my_str.substring(num, num+n);
            num += n;
        }
        
        if(rest > 0){
            answer[share] = my_str.substring(num, num+rest);

        }
    
        return answer;
    }
}