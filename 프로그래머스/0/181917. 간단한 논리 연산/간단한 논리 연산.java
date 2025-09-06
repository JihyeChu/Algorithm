class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x_12 = true;
        boolean x_34 = true;
        
        if(x1 == false && x2 == false){
            x_12 = false;
        }
        if(x3 == false && x4 == false){
            x_34 = false;
        }
        if(x_12 == false || x_34 == false){
            answer = false;
        }else{
            answer = true;
        }
        
        return answer;
    }
}