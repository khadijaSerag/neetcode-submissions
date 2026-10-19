class Solution {
    public int removeElement(int[] nums, int val) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int k = -1;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != val){
               map.put(k+1,nums[i]);
               k++;
            } 
        }

        int i=0;
        for (int value : map.values()) {
            nums[i] = value;
            i++;
        }

        System.out.println("map"+ map);
        System.out.println("nums"+ Arrays.toString(nums));
        
        return map.size();
    }
}