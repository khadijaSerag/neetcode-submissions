class Solution {
    public void reverseString(char[] s) {
        int right = s.length-1;

        for(int left= 0; left <= right; left++){
            char helper = s[left];
            s[left] = s[right];
            s[right] = helper;
            right --;
        }
        System.out.println("the reverse array is : " + Arrays.toString(s));
    }
}