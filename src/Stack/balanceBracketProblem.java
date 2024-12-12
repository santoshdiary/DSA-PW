package Stack;

import java.util.Stack;

public class balanceBracketProblem {
    public  static boolean isBalanced(String s){
        int n=s.length();
        Stack<Character> st =new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='('){
               st.push(ch);
            }
            else {        //     ')' can't be balanced
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }

            }

            if(st.isEmpty() ){
                return true;
            }
        }
        if(st.size()>0) return false;
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        String st="(())))"; // false
        String st1=")((("; // false
        String st2="(())";// ture

        System.out.println(isBalanced(st2));

    }
}
