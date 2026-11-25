class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;

        arr.add(nums[0]);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                arr.add(nums[i+1]);
            }    
        }

        for(int a : arr){
            nums[index]= a;   
            index++;    
        }

        System.out.println(arr);

        return arr.size();

    }
}