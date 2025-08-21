class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double first = 0;
        double second = 0;
        
        first = (double)(dots[1][1]-dots[0][1]) / (dots[1][0]-dots[0][0]);
        second = (double)(dots[3][1]-dots[2][1]) / (dots[3][0]-dots[2][0]);
        if(first == second) return 1;

        first = (double)(dots[2][1]-dots[0][1]) / (dots[2][0]-dots[0][0]);
        second = (double)(dots[3][1]-dots[1][1]) / (dots[3][0]-dots[1][0]);
        if(first == second) return 1;

        first = (double)(dots[3][1]-dots[0][1]) / (dots[3][0]-dots[0][0]);
        second = (double)(dots[2][1]-dots[1][1]) / (dots[2][0]-dots[1][0]);
        if(first == second) return 1;

        return answer;
    }
}