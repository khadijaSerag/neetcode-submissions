class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int right = s.length()-1;
        System.out.println(s);

        for(int left = 0; left<= right; left++){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
        }
      
        return true;
    }
}
