class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        int count = 0;
        
        for(int num : nums){
            if(first == num || second == num || third == num){
                continue;
            }
            if(num > first){
                third = second;
                second = first;
                first = num;
            }else if(num > second){
                third = second;
                second = num;
            }else if(num > third){
                third = num;
            }
            count++;
        }   
        return count < 3 ? (int)first : (int)third;
    }
}