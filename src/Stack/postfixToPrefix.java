package Stack;

import java.util.Stack;

public class postfixToPrefix {

    public static void main(String[] args) {
        String str="953+4*6/-";//  -9/*+5346
        Stack<String> st=new Stack<>();
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else{
                String v1=st.pop();
                String v2=st.pop();
                char op=ch;
                String t = op + v2 + v1; // note that via dry run
                // when we traverse froward then first and second value will be v2 and v1 respectively
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }

}
