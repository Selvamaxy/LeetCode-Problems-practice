class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        String splstr="!@#$%^&*()-+";
        Boolean lowcase,upcase,digit,spl;
        lowcase=false;
        upcase=false;
        digit=false;
        spl=false;
        for(int i=0;i<password.length()-1;i++){
            if(password.charAt(i)==password.charAt(i+1))
                return false;
        }
        for(char c:password.toCharArray()){
            if(Character.isLetter(c)){
            if(Character.isLowerCase(c)) lowcase=true;
            else
                upcase=true;
            }
            else{
                if(Character.isDigit(c)) digit=true;
                if(splstr.indexOf(c)!=-1) spl=true;
            }
        }
         return lowcase && upcase &&digit && spl;
         
    }
   
}