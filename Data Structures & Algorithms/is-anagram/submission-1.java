class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        else{

            for(int i=0; i<s.length(); i++){
                if(mapS.containsKey(s.charAt(i))){
                    int value= mapS.get(s.charAt(i));
                    mapS.put(s.charAt(i), value+1);
                }else{
                    mapS.put(s.charAt(i),1);
                }
            }

            for(int i=0; i<t.length(); i++){
                if(mapT.containsKey(t.charAt(i))){
                    int value= mapT.get(t.charAt(i));
                    mapT.put(t.charAt(i), value+1);
                }else{
                    mapT.put(t.charAt(i),1);
                }
            }
            System.out.println("mapS= " + mapS);
            System.out.println("mapT= " + mapT);

            if(mapS.equals(mapT)){
                return true;
            }else{
                return false;
            }
        }
    }
}
