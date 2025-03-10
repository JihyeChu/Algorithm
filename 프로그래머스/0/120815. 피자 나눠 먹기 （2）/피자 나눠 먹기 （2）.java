class Solution {
    public int solution(int n) {
        int pizza = 6;
        int count = 1;
        
        while(pizza % n != 0){
            pizza += 6;
            count++;
        }
        
        return count;
    }
}