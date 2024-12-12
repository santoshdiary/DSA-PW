package Stack;

import java.util.Stack;

public class basicStack {

    // implementing in built stack
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(34);
        st.push(23);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("size of stack="+ st.size());

    }
}
