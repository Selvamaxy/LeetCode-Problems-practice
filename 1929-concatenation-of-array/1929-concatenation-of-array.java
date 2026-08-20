class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length*2;
        int[] arr=new int[len];
       // System.out.println(len);
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+len/2]=nums[i];
           //System.out.printf("%d %d ",i,i+len);
        }
        return arr;
    }
}