class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n%2+n/2];
        int num = 1;
        answer[0] = 1;
        for(int i=1; i<answer.length; i++){
            answer[i] = (num+=2);
        }
        return answer;
    }
}