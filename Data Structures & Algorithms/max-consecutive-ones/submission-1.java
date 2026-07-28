class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNumConsecutive=0;
        int testMax=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                testMax+=1;
            }
            else{
                if(testMax-1>maxNumConsecutive){
                    maxNumConsecutive=testMax-1;
                }
                testMax=1;
            }
        }
        if(testMax-1>maxNumConsecutive){
            maxNumConsecutive=testMax-1;
        }
       
        return maxNumConsecutive;
    }
}