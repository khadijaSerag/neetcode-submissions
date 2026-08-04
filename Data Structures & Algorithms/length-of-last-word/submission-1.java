class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char[] arr = s.toCharArray();
        int output=0; 

        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] != ' '){
                output+=1;
            }
            else{
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
        return output;
    }
}