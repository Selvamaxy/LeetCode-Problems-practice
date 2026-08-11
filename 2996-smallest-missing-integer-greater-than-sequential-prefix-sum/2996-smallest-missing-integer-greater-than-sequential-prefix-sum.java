class Solution {
    public int missingInteger(int[] nums) {
        int pres=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1)
                pres+=nums[i];
            else
                break;
        }   
            HashSet<Integer> hs=new HashSet<>();
            for(int n:nums){
                hs.add(n);
        }
        while(hs.contains(pres))
            pres++;
        return pres;
    }
}