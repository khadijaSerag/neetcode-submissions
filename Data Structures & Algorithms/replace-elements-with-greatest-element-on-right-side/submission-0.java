class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int max;
        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1){
                ans[i]=-1;
            }
            else{
                max=0;
                for(int j=i+1; j-i<arr.length-i; j++){
                    if(arr[j] >= max){
                        max = arr[j];
                    }
                } 
                ans[i]=max; 
            }
           
        }
        return ans;
    }
}