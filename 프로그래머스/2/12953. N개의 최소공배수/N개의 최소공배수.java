class Solution {
     public int solution(int[] arr) {
        int answer = arr[0];

        for(int i=1; i<arr.length; i++){
            answer = answer*arr[i]/gcd(answer, arr[i]);
        }
        return answer;
    }

    private int gcd(int answer, int i) {
        while(i != 0){
            int tmp = answer%i;
            answer = i;
            i = tmp;
        }
        return answer;
    }
}