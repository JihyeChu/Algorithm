class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(a+""+b);
        if(answer < 2*a*b){
            return 2*a*b;
        }else{
            return answer;
        }
    }
}