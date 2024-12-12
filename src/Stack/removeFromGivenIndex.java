package Stack;

import java.util.Stack;

public class removeFromGivenIndex {

    public static void insert(Stack<Integer>st,int idx,int data){
        // iterative method
        Stack<Integer> temp=new Stack<>();
        for(int i=1;i<idx;i++){
            temp.push(st.pop());
        }
        st.push(data);
        while(temp.size()>0){
            st.push(temp.pop());
        }

    }
    public static void remove(Stack<Integer>st,int idx){
        Stack<Integer> temp=new Stack<>();
        for(int i=1;i<=idx-1;i++){
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(34);
        st.push(23);
        st.push(12);
        System.out.println(st);
       // insert(st,2,22);
        remove(st,2);
        System.out.println(st);

    }
}
