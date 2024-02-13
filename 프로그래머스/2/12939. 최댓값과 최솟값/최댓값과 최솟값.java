import java.util.Arrays;

class Solution {
   public String solution(String s) {
        String[] word = s.split("\\s");
        int[] nums = new int[word.length];

        for(int i=0; i<word.length; i++){
            nums[i] = Integer.parseInt(word[i]);
        }

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        return min + " " + max;
    }
}