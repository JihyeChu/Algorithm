class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int count = -1;
        for(String name : seoul){
             count++;
            if(name.equals("Kim")){
                break;
            }
           
        }
        answer = "김서방은 " + count + "에 있다";
        return answer;
    }
}