package Stack;
import java.util.*;
public class copyElementInOtherStack {

    public static void copyStackRec(Stack<Integer>inStack,Stack<Integer> fromStack){
      if(fromStack.isEmpty()){  // base case
          return ;
      }
      int topVal=fromStack.pop();
       copyStackRec(inStack,fromStack); // recursive work
        inStack.push(topVal);   // self work
        fromStack.push(topVal);
    }
    public static Stack<Integer> copyStack(Stack<Integer>inStack,Stack<Integer> fromStack){
      // iterative method
       Stack<Integer> temp=new Stack<>();
       while(fromStack.size()>0){
           temp.push(fromStack.pop());
       }
       while(temp.size()>0){
           inStack.push(temp.pop());
       }
        return inStack;
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(34);
        s.push(34);
        s.push(23);
        s.push(9);

        System.out.println(s);
//        System.out.println("copy ");
//        Stack<Integer> gt=new Stack<>();
//        while(s.size()>0){
//            gt.push(s.pop());
//        }
//        Stack<Integer> rt=new Stack<>();
//        while(gt.size()>0){
//            rt.push(gt.pop());
//        }
//        System.out.println(rt);
        Stack<Integer> copy=new Stack<>();
//        copyStack(copy,s);
//        System.out.println(copy);
        copyStackRec(copy,s);
        System.out.println(copy);

    }
}
