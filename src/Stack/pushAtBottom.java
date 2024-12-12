package Stack;

import java.util.Stack;

public class pushAtBottom {
    public static void pushingBottomRec(Stack<Integer>s,int data){
        // recursive method

        if(s.size()==0){
            s.push(data);
            return;
        }
        int topVal=s.pop();
        pushingBottomRec(s,data);
        s.push(topVal);
    }
    public static void pushingBottom(Stack<Integer>s,int data){
        //iterative method
        Stack<Integer> temp=new Stack<>();
        while(s.size()>0){
            temp.push(s.pop());
        }
        s.push(data);
        while(temp.size()>0){
            s.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(34);
        st.push(23);
        System.out.println(st);
      //  pushingBottom(st,30);
       pushingBottomRec(st,30);
       System.out.println(st);
    }
}
