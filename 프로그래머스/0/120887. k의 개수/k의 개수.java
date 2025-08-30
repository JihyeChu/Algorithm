class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char charK = String.valueOf(k).charAt(0);
        
        for(int count=i; count<=j; count++){
            String num_count = String.valueOf(count);
            for(int cou=0; cou<num_count.length(); cou++){
                char c = num_count.charAt(cou);
                if(c==charK){
                    answer++;
                }
            }
        }
        return answer;
    }
}