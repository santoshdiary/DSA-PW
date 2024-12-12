package Stack;

import java.util.Stack;

public class insertElement {
    // Inserting element in bottom or given index

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(34);
        s.push(34);
        s.push(23);
        s.push(9);
        System.out.println(s);
        // index for insertion

        int idx=1;
        int x=12;
        Stack<Integer> temp=new Stack<>();
        while(s.size()>idx){
            temp.push(s.pop());
        }
        s.push(x);

        while(temp.size()>0){
            s.push(temp.pop());
        }
        System.out.println(s);
    }


}
