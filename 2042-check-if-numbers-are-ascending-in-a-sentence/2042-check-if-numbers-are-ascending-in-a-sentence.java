class Solution {
    public boolean areNumbersAscending(String s) {
        int p=-1;
        int num=0;
        String[] text=s.split(" ");
        for(String iter:text){
            if(Character.isDigit(iter.charAt(0))){
                 num=Integer.parseInt(iter);
                if(p>=num)
                    return false;
                    
            }
            p=num;
        }
        return true;
    }
}