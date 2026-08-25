class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max=0;
        int key=0;

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i], value+1);
                if(max<value+1){
                    max=value+1;
                    key = nums[i];
                }
            }
            else{
                map.put(nums[i],1);
                if(max<1){
                    max=1;
                    key=nums[i];
                }
            }
        }
        return key;
    }
}