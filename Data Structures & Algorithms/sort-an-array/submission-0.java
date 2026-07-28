class Solution {
    public int[] sortArray(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1){
                break;
            }else{
                for(int j=i+1; j-i<nums.length-i; j++){
                    if(nums[i]>nums[j]){
                       max=nums[i];
                       nums[i]=nums[j];
                       nums[j]=max;
                    }
                }
            }
        }
        return nums;
    }
}