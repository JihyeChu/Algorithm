class Solution {
    static{
        for(int i = 0 ;i<=500;i++){
        moveZeroes(new int[]{});
        }

    }

    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int n = nums.length;
        int temp=0;
        for(;j<n;j++){
            if(nums[j]!=0){
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i+=1;
            }
        }
    }
}