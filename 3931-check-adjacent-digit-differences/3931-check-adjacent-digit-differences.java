class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int t=1;
        for(int i=0;i<s.length()-1;i++){
            int d=Math.abs(s.charAt(i)-s.charAt(i+1));
            if(d>2) t=0;

        }
        if(t==1) return true;
        else
            return false;
    }
}