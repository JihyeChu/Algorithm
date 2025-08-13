class Solution {
    public int solution(String my_string) {
        String[] array = my_string.split(" ");
        int answer = Integer.parseInt(array[0]);
        
        for(int i=1; i<array.length; i+=2){
            String as = array[i];
            int num = Integer.parseInt(array[i+1]);
            
            if(as.equals("+")){
                answer += num;
            }else{
                answer -= num;
            }
        }
        return answer;
    }
}