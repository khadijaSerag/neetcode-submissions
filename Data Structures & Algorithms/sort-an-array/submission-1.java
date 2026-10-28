class Solution {
    public int[] sortArray(int[] nums) {
        for(int i =0; i<nums.length-1; i++){
            int min=nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    if(nums[j]<min){
                        min= nums[j];
                        nums[j]=nums[i];
                        nums[i]=min;
                    }
                }
            }
        }
        return nums;
    }
}