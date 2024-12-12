package Stack;

public class ArrayImplementation {
    public  static class stack{

        int [] arr=new int[6];
        int top=0;
        void push(int x){
            arr[top]=x;
            top++;
        }
        int peek(){
            if(top==0) {
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[top-1];
        }
        int pop(){
            if(top==0){
                System.out.println("stack is empty ");
                return -1;
            }
            int topVal=arr[top-1];
            arr[top]=0;
            top--;
            return topVal;
        }

        void display(){
            for(int i=0;i<=top-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return top;
        }
        boolean isFull(){
            if(top!=arr.length){
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        stack a=new stack();
        a.push(4);
        a.push(1);
        a.push(45);
        a.push(23);
        a.push(12);
        a.push(34);
        a.display();
        int t=a.size();
        System.out.println("size of stack "+ t);
        boolean r= a.isFull();
        System.out.println(r);
    }
}
