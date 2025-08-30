class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int rest = 0;
        
        while(chicken >= 10){ 
            rest = chicken / 10; // rest = 108
            chicken = rest + (chicken % 10); // answer = 1
            answer += rest; // 109 / 
        }
            
        return answer;
    }
}