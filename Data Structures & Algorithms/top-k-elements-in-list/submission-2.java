class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int[] result = new int[k];

       ArrayList<Map.Entry<Integer,Integer>> elements = new ArrayList<>();

       for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],value+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           elements.add(entry);
        }

        elements.sort((a,b)-> Integer.compare(b.getValue(),a.getValue())); // to sort discending

        for(int i=0; i<k; i++){
            result[i]= elements.get(i).getKey();
        }

        return result;
    }
}
