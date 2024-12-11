import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int n = 0;
        for(int num : nums){
           answer[n++] = num*num;
        }

        Arrays.sort(answer);
        return answer;
    }
}