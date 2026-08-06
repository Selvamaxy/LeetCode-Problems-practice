class Solution {
    public int removeElement(int[] nums, int val) {
        int oind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[oind]=nums[i];
                oind++;
            }
        }
        return oind;
    }
}