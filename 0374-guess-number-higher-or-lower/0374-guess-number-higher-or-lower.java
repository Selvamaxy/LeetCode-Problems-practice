/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int st=1;
        int ran=n;
        
        while(st<=ran){
            int num=(st+((ran-st)/2));
            if(guess(num)==0)
                {
                    return num;
                }
            else if(guess(num)==-1){
                ran=num-1;
            }
            else
                st=num+1;
        }
        return -1;
    }
}