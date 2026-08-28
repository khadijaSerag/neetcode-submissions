class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int index = -1;

        for(int i=0; i<magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                int value = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i), value+1);
            }
            else{
                map.put(magazine.charAt(i),1);
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(map2.containsKey(ransomNote.charAt(i))){
                int value = map2.get(ransomNote.charAt(i));
                map2.put(ransomNote.charAt(i), value+1);
            }
            else{
                map2.put(ransomNote.charAt(i),1);
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i))){
                if(map2.get(ransomNote.charAt(i)) > map.get(ransomNote.charAt(i))){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}