class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int q=0; q<queries.length; q++){
            int s = queries[q][0], e = queries[q][1], k = queries[q][2];
            
            for(int i=s; i<=e; i++){
                if(i % k == 0){
                    arr[i] += 1;
                }
            }
        }
        
        
        return arr;
    }
}