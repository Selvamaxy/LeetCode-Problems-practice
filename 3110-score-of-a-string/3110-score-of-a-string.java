class Solution {
    public int scoreOfString(String s) {
        int sc=0;
        for(int i=0;i<s.length()-1;i++){
            int  diff=Math.abs(s.charAt(i)-s.charAt(i+1));
            sc+=diff;
        }
        return sc;
    }
}