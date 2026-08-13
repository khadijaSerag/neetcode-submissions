class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> maps = new HashMap<>();
        List<List<String>> output = new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(maps.containsKey(key)){
                List<String> value = maps.get(key);
                value.add(strs[i]);
            }
            else{
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                maps.put(key,value);
            }
        }
        for(List<String> map : maps.values()){
             output.add(map);
        }
        // System.out.println("maps= " + maps);
        return output;
    }
}
