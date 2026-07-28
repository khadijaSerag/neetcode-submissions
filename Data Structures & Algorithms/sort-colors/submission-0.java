class Solution {
    public void sortColors(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j-i<nums.length-i; j++){
                if(nums[i]>nums[j]){
                    max=nums[i];
                    nums[i]=nums[j];
                    nums[j]=max;
                }
            }
        }
        System.out.println(nums);      
    }
}