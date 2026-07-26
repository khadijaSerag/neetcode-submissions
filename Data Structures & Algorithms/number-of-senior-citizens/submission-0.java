class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(int i=0; i<details.length; i++){
            String current = details[i];

            for(int j=0; j<current.length(); j++){
                if(j==11){
                    String twoDigits = "" + current.charAt(j) + current.charAt(j + 1);
                    int number = Integer.parseInt(twoDigits);

                    if(number > 60){ 
                        ans= ans+1;
                        System.out.printf("The number is: %d%n", number);       
                    }
                }
            }
        }
        return ans;
    }
}