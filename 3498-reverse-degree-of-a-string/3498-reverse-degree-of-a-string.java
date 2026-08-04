class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int iter=0;
        for(char c:s.toCharArray()){
            iter+=1;
            int num=c-'a'+1;
            sum+=iter*(27-num);
            //System.out.printf("%d %d ",num,sum);
        }
        return sum;
    }
}