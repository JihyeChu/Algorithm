class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], sides[1]); // 11
        int min = Math.min(sides[0], sides[1]); // 7

        answer = min + (min-1);
        
        return answer;
    }
}