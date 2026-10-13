class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        int r=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return x==rev;
    }
}