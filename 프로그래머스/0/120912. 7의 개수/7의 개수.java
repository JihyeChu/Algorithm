class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int arr : array){
            String a = String.valueOf(arr);
            for(char c : a.toCharArray()){
                if(c == '7'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}