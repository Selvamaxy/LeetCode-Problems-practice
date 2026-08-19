class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set=new HashSet<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            if(set.size()==(i+1)%3)
                res++;
            if(set.size()>2)
                break;
        }

       
        return res;
    }
}