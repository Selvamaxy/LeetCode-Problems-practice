class Solution {
    public int reverseDegree(String s) {
        int tot=0;
        for(int i=0;i<s.length();i++){
            tot+=('z'-s.charAt(i)+1)*(i+1);
        }
        return tot;
    }
}