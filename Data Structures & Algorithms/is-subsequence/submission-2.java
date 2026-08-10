class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for(int i =0; i<s.length(); i++){
            if(t.indexOf(s.charAt(i), index+1)==-1){
                return false;
            }
            else{
                index  = t.indexOf(s.charAt(i), index+1);
            }
        }
        return true;
    }
}