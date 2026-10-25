class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();

        // write in HashMap
       for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],value+1);
            }else{
                map.put(nums[i],1);
            }
        }

        // read from HashMap
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();

            if(value>nums.length/2){
                return key;
            }
        }
       return 0;
    }
}