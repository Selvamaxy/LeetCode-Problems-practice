class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> ch=new HashSet<>();
        for(char c:s.toCharArray()){
            if(ch.contains(c))
                return c;
            ch.add(c);
        }
        return 'c';
    }
}