class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0],val=0;
        for(int n:nums){
            if(max<n) max=n;
        }
        for(int n:nums){
            val+=max-n;
        }
        return val;
    }
}