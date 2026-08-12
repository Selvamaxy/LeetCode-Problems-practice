class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        for(int i='Z';i>='A';i--){
            if(set.contains((char)i) && set.contains(Character.toLowerCase((char)i)))
                return ""+(char) i;
        }
        return "";
    }
}