class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> values = new ArrayList<>();

        for(int i = 0; i<nums2.length; i++){
            int max=-1;
            for(int j=i+1; j<nums2.length; j++){
                if(nums2[i]<nums2[j]){
                    max= nums2[j];
                    break;
                }
            }
            map.put(nums2[i],max);
        }

        for(int i =0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                int value = map.get(nums1[i]);
                values.add(value);
            }
        }

        int[] output = new int[values.size()];

        for(int i=0; i<values.size(); i++){
            output[i]= values.get(i);
        }

        return output;
    }
}