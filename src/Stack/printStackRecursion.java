package Stack;

import java.util.Stack;

public class printStackRecursion {
    public static void displayReverseRec(Stack<Integer> st){
        // base case
        if(st.isEmpty())return ;

        int top=st.pop();
        System.out.print(top+" ");
        // recursive work
        displayReverseRec(st);
        st.push(top); // Note - the value of top will be not destroyed because it stored in "call stack "

    }
    public static void displayRec(Stack<Integer> st){
        // base case
        if(st.isEmpty())return ;

        int top=st.pop();

        // recursive work
        displayReverseRec(st);
        System.out.print(top+" ");
        st.push(top); // Note - the value of top will be not destroyed because it stored in "call stack "

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>( );

        s.push(34);
        s.push(67);
        s.push(23);
        s.push(9);
        System.out.println(s);
        System.out.println(" printing using recursion ");
        displayRec(s);
        System.out.println(" printing Reverse using recursion ");
        displayReverseRec(s);


    }
}
