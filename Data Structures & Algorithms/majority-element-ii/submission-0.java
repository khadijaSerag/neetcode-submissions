class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>(); 
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],value+1);
            } 
            else{
                map.put(nums[i],1);
            }       
        }

        for(Map.Entry<Integer,Integer> entity : map.entrySet()){
            int key = entity.getKey();
            int value = entity.getValue();

            if(value>nums.length/3){
                result.add(key);
            }
        }

        System.out.println("the result list is: " + result);
        return result;

    }
}