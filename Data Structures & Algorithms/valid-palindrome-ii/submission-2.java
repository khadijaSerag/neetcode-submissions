class Solution {
    public boolean validPalindrome(String s) {
        int right= s.length()-1;

        for(int left = 0; left<right; left++){
            if(s.charAt(left)!=s.charAt(right)){
               return isPalindrome(s,left+1,right) ||  isPalindrome(s,left,right-1);
            }
            right--;
        }
        return true;
        
    }
    public boolean isPalindrome(String s, int left, int right){
        while(left<right){

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            right--;
            left++;
        }
        return true;
    }
}