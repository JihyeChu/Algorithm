class Solution {
  public int solution(int num) {
        int count = 0;
        while(num != 1){
            if(count >= 400){
                return -1;
            }
            if(num%2 == 0){
                num = num/2;
            }else{
                num = num*3+1;
            }
            count++;
        }

       return count;
    }
}