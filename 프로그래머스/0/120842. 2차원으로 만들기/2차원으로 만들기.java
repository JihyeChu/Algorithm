class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        
        int len = num_list.length;
        
        answer = new int[len/n][n];
        
        for(int i=0; i<len; i++){
            answer[i/n][i%n] = num_list[i];
        }
        
        return answer;
    }
}