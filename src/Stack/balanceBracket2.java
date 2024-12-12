package Stack;
import java.util.*;
public class balanceBracket2 {


    public static void main(String[] args) {
        String st="([)";
        System.out.println(  balance(st));
    }
    public  static boolean balance(String s) {
        Stack<Character> st=new Stack<>();

        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='(') {
                st.push(ch);
            }
            if(ch=='{'){
                st.push(ch);
            }
            if(ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='(' && ch==')'){
                    st.pop();
                }
                if(st.peek()=='{' && ch=='}'){
                    st.pop();
                }
                if(st.peek()=='[' && ch==']'){
                    st.pop();
                }

            }
        }
        if(st.size() ==0){
            return true;
        }
        else{
            return false;
        }
    }
}
