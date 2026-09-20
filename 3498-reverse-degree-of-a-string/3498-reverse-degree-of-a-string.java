class Solution {
    public int reverseDegree(String s) {
     int tot=0;
     for(int i=0;i<s.length();i++){
        tot+=(int)('z'-s.charAt(i)+1)*(i+1);
       // System.out.println(tot);
     }
     return tot;
    }
}