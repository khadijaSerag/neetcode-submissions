class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), value+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int value:map.values()){
            if(value % 2 != 0) {
                if(maxOdd < value) {
                    maxOdd = value;
                }
            }
            else {
                if(minEven > value) {
                    minEven = value;
                }
            }
        }

        System.out.println(maxOdd); 
        System.out.println(minEven); 

        int output= maxOdd-minEven;
        return output;
    }
}