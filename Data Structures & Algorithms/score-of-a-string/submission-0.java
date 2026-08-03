class Solution {
    public int scoreOfString(String s) {
        int output=0;
        int sub =0;
        int[] arr = new int[s.length()];
      
        for(int i=0; i<s.length(); i++){
            int charAscii = (int) s.charAt(i);
            arr[i]= charAscii;
        }
        for(int i=0; i<arr.length -1; i++){
            sub= Math.abs(arr[i+1]-arr[i]);
            output+=sub;
        }
        System.out.print(Arrays.toString(arr));
        return output; 
         
    }
}