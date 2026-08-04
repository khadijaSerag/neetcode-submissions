class Solution {
    public int appendCharacters(String s, String t) {
        char[] arr = t.toCharArray();
        int index = -1;
        int output = 0;

        for(int i=0; i<arr.length; i++){
            if(s.indexOf(arr[i],index+1) == -1 ){
                output = arr.length-i;
                break;
            }
            else{
                index = s.indexOf(arr[i],index+1);
            }
        }
        return output;
    }
}