class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr1 = s.toCharArray();
        int max = -1;

        for(int i=0; i<arr1.length; i++){
            int index= t.indexOf(arr1[i], max+1);
            System.out.println(index);
            if(index == -1){
                return false;  
            } 
            else{
                if(index < max){
                    return false;
                }
                max=index;
            } 
        }
        return true;
    }
}