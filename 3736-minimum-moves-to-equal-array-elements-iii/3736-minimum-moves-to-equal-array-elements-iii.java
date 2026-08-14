class Solution {
    public int minMoves(int[] nums) {
        int max=-1;
        for(int n:nums){
                if(max<n)
                    max=n;
        }
        int n=0;
        for(int iter:nums){
            n=n+(max-iter);
        }
        return n;
    }
}