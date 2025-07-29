class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int len = numbers.length;

        int direct = (direction.equals("right")) ? 1 : -1;
        
        for(int i=0; i<len; i++){
            answer[i] = numbers[(i - direct + len) % len];
        }
        
        return answer;
    }
}