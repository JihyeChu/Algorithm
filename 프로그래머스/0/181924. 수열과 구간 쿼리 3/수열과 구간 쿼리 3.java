class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        for(int i=0; i<queries.length; i++){
            int tmp = queries[i][0];
            int blank = answer[tmp];
            int tmp1 = queries[i][1];
            answer[tmp] = answer[tmp1];
            answer[tmp1] = blank;
        }
        return answer;
    }
}