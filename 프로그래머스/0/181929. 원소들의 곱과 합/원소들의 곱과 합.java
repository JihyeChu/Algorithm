class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int sum = 0;
        for(int num : num_list){
            sum += num;
            multi *= num;
        }
        
        return multi > sum*sum ? 0 : 1;
    }
}