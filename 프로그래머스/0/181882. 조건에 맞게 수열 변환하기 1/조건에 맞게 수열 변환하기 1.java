class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int i = 0;
        for(int a : arr){
            if(a >= 50 && (a%2)==0){
                answer[i] = a / 2;
            }else if(a < 50 && (a%2)==1){
                answer[i] = a * 2;
            }else{
                answer[i] = a;
            }
            i++;
        }
        return answer;
    }
}