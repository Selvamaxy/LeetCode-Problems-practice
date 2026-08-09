class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String w:tokens){
            if(w.equals("+"))
                st.push(st.pop()+st.pop());
            else if(w.equals("*"))
                st.push(st.pop()*st.pop());
            else if(w.equals("/")){
            int n=st.pop();
                st.push(st.pop()/n);}
            else if(w.equals("-")){
            int n=st.pop();
                st.push(st.pop()-n);}
            else
            {
                st.push(Integer.parseInt(w));
            }
           //System.out.println(st.peek());
        }
        return st.pop();
    }
}