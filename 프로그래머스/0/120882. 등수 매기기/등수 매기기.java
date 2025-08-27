class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int[] result = new int[score.length];
        int i = 0;
        
        
        for(int[] s : score){
            answer[i++] = (s[0]+s[1])/2.0;
        }
        
        for(int j=0; j<answer.length; j++){
            int rank = 1;
            for(int k=0; k<answer.length; k++){
                if(answer[j] < answer[k]){
                    rank++;
                }
            }
            result[j] = rank;
        }
        
        return result;
    }
}