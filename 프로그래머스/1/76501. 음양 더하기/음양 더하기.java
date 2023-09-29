class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int j=0; j<signs.length; j++){
            answer = signs[j] ? (answer += absolutes[j]) : (answer -= absolutes[j]);
        }
        
        return answer;
    }
}