class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(char ch:address.toCharArray()){
            if(Character.isDigit(ch))
                sb.append(ch);
            else
            {
                sb.append('[');
                sb.append(ch);
                sb.append(']');
            }
        }
        return sb.toString();
        
    }
}