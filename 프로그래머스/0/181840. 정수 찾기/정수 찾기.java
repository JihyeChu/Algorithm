class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int number : num_list){
            if(number == n){
                return 1;
            }
        }
        return answer;
    }
}