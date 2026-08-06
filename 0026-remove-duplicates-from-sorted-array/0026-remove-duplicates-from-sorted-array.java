class Solution {
    public int removeDuplicates(int[] nums) {
        int se=0;
        for(int j=1;j<nums.length;j++){
            if(nums[se]!=nums[j]){
                se++;
                nums[se]=nums[j];
            }
        }
        return se+1;
    }
}