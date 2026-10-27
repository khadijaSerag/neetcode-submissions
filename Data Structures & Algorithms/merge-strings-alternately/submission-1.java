class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left=0 ;
        int right=0 ;
        String output = "";


        char c1;
        char c2;

        if(word1.length() == word2.length()){
            while(left<word1.length()){
                c1 = word1.charAt(left);
                c2 = word2.charAt(right);

                output = output + c1 + c2;

                left++;
                right++;
            }
        }


        else if(word1.length() > word2.length()){
            while(left<word2.length()){
                c1 = word1.charAt(left);
                c2 = word2.charAt(right);

                 output = output + c1 + c2;

                left++;
                right++;
            }
            for(int i = left; i<word1.length(); i++){
                c1 = word1.charAt(i);
                output= output + c1;
            }
        }
        

        else if(word2.length() > word1.length()){
            while(left<word1.length()){
                c1 = word1.charAt(left);
                c2 = word2.charAt(right);

                 output = output + c1 + c2;

                left++;
                right++;
            }
            for(int i = right; i<word2.length(); i++){
                c2 = word2.charAt(i);
                output= output + c2;
            }
        }
        
        
        return output;
    }
}