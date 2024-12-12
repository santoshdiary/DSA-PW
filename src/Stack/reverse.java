package Stack;

import java.util.Stack;

public class reverse {
    public static void copyStackRec(Stack<Integer>inStack,Stack<Integer> fromStack){
        if(fromStack.isEmpty()){  // base case
            return ;
        }
        int topVal=fromStack.pop();
        copyStackRec(inStack,fromStack); // recursive work
        inStack.push(topVal);   // self work
        fromStack.push(topVal);
    }
    public static void Reverse(Stack<Integer>st){
       // iterative
        Stack<Integer> temp=new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        copyStackRec(st,temp);
    }
    public static Stack<Integer> ReverseRec(Stack<Integer>stack,Stack<Integer>reversed){
      // Recursive method

        if(stack.isEmpty()){
            return stack;
        }
        int topVal=stack.pop();
        reversed.push(topVal);
        ReverseRec(stack,reversed);

        return stack;
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(34);
        st.push(23);
        st.push(12);
        System.out.println(st);
        Stack<Integer> pt=new Stack<>();
        ReverseRec(st,pt);
        System.out.println(pt);

    }
}
