class Solution {
    public int minimizedStringLength(String s) {
        int found=0;
        boolean[] arr=new boolean[26];
        for(int i=0;i<s.length();i++){
            arr[(int)(s.charAt(i)-'a')]=true;
        }
       for(boolean b:arr){
        if(b) found++;
       }
        return found;
    }
}