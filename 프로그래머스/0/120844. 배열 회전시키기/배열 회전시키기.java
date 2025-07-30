class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int len = numbers.length;
        int index = 0;
        
        if(direction.equals("right")){
            for(int i=0; i<len; i++){
                index = (i-1+len) % len;
                answer[i] = numbers[index];
            }
        }else{
             for(int i=0; i<len; i++){
                index = (i+1+len) % len;
                answer[i] = numbers[index];
             }
        }
        
        return answer;
    }
}