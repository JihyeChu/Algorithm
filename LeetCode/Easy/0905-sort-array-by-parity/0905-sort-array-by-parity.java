class Solution {
    public int[] sortArrayByParity(int[] nums) {
    
        int[] result = new int[nums.length];
        int writeEven = 0;
        int writeOdd = nums.length-1;
        
        // [3,1,2,4]
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2 == 0) {
                result[writeEven++] = nums[i]; 
            } else {
                result[writeOdd--] = nums[i]; 
            }
        }
        return result;
    }
}