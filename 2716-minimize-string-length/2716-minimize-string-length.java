class Solution {
    public int minimizedStringLength(String s) {
        int found=0;
        boolean[] arr=new boolean[26];
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']!=true){
            arr[(s.charAt(i)-'a')]=true;
            found++;
            }
        }
      
        return found;
    }
}