package Stack;

import java.util.Stack;

public class infixExpression {


    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>(); // value stack
        Stack<Character> op=new Stack<>(); // operator stack

        String str="8-(5+3)*4/6"; // infix
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asciiVal=(int)ch;  // finding the ascii value of current character
            if(asciiVal>=48 && asciiVal<=57){ // means current character is number
               val.push(asciiVal-48) ; // we're not pushing ascii val instead the character's val.
                
            } else if (op.size()==0 || ch=='(' || op.peek()=='(' ) { // that means current char is not character, operator


                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    int val2=val.pop();
                    int val1=val.pop();
                    if(op.peek()=='-')val.push(val1-val2);
                    if(op.peek()=='+')val.push(val1+val2);
                    if(op.peek()=='*')val.push(val1*val2);
                    if(op.peek()=='/')val.push(val1/val2);
                    op.pop();
                }
                op.pop(); // '(' deleted
            }
            else{
                if(ch=='+'|| ch=='-'){ // means peak of stack is either * or \  i.e. higher priority bc it's else case of op.size()!=0 there fore already * or \ exist
                    //work
                    int val2=val.pop();
                    int val1=val.pop();
                    if(op.peek()=='-')val.push(val1-val2);
                    if(op.peek()=='+')val.push(val1+val2);
                    if(op.peek()=='*')val.push(val1*val2);
                    if(op.peek()=='/')val.push(val1/val2);
                    op.pop();
                    op.push(ch);
                }

                if(ch=='*'|| ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        //work
                        int val2=val.pop();
                        int val1=val.pop();

                        if(op.peek()=='*')val.push(val1*val2);
                        if(op.peek()=='/')val.push(val1/val2);
                        op.pop();
                        op.push(ch);
                        //push
                    }
                    else{
                        op.push(ch);
                    }
                }



            }


        }
        // val stack size ->1
        while(val.size()>1){
            int val2=val.pop();
            int val1=val.pop();
            if(op.peek()=='-')val.push(val1-val2);
            if(op.peek()=='+')val.push(val1+val2);
            if(op.peek()=='*')val.push(val1*val2);
            if(op.peek()=='/')val.push(val1/val2);
            op.pop();

        }
        System.out.println(val.peek());


    }
}
