class Solution {
   public int solution(int num) {
        int count = 0;
        if(num == 1){ return 0;}
        while(true){
            if(count >= 400){
                return -1;
            }
            if(num == 1){
                break;
            }else if(num%2 == 0){
                num = num/2;
            }else{
                num = num*3+1;
            }
            count++;
        }

       return count;
    }
}