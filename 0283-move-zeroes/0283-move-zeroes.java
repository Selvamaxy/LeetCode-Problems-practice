class Solution {
    public void moveZeroes(int[] nums) {
        int search_ind=0;
        int store_ind=0;
        for(;search_ind<nums.length;search_ind++){
            if(nums[search_ind]!=0){
                nums[store_ind]=nums[search_ind];
                store_ind++;
            }
        }
        while(store_ind<nums.length){
            nums[store_ind]=0;
            store_ind++;
        }
       
    }
}