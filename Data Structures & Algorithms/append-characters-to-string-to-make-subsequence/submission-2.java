class Solution {
    public int appendCharacters(String s, String t) {
        int index = -1;
        int output = 0;

        for(int i=0; i<t.length(); i++){
            if(s.indexOf(t.charAt(i),index+1) == -1 ){
                output = t.length()-i;
                break;
            }
            else{
                index = s.indexOf(t.charAt(i),index+1);
            }
        }
        return output;
    }
}