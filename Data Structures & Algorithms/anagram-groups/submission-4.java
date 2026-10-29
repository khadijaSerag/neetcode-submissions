class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List< List<String> > output = new ArrayList<>();
       HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(map.containsKey(key)){ // key is the sort strs[i]
                List<String> value = map.get(key); // value is the orginal strs[i]
                value.add(strs[i]);
            }
            else{
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                map.put(key,value);
            }
        }

        for(List<String> value : map.values()){
            output.add(value);
        }

        return output;
    }
}
