class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Map.Entry<Integer,Integer>> elements = new ArrayList<>();
        int[] output = new int[k];

        // write in HashMap 
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],value+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        // read from HashMap
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            elements.add(entry);  
        }

        // Sort by frequency - descending
        elements.sort((a, b) ->
                Integer.compare(b.getValue(), a.getValue())
        );

        // Take first k elements
        for (int i = 0; i < k; i++) {
            output[i] = elements.get(i).getKey();
        }
        
        return output;
    }
}
