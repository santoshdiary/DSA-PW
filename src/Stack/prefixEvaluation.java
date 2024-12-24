package Stack;

import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        String str="-9/*+5346";

        Stack<Integer> st=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int asciiVal=(int)ch;
            if(asciiVal>=48 &&  asciiVal<=57){ //number
                st.push(asciiVal-48);

            }
            else{
                // operator
                int val1=st.pop();
                int val2=st.pop();
                if(ch=='+') st.push(val1+val2);
                if(ch=='-') st.push(val1-val2);
                if(ch=='*') st.push(val1*val2);
                if(ch=='/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());

    }
}
