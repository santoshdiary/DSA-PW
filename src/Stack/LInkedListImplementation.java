package Stack;

public class LInkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
        }
    }
    public  static class stack{ // user define data structure
        Node head;
        int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayReverse(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int  size(){
           return size;
        }
        int pop(){
            if(head==null) {
                System.out.println(" Stack is empty ");
                return -1;
            }
            int popVal=head.data;
            head=head.next;
            return popVal;
        }
        int peek(){
            return head.data;
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        void display(){
            // if we directly print then we get reverse stack, bc connection(next) is reverse ; that's why used reverse display
          reverseDisplay(head);
            System.out.println();
        }

        // helper method for display method , because we need "head" as a parameter for display
        void reverseDisplay(Node h){
            if(h==null) return ;
            reverseDisplay(h.next);
            System.out.print(h.data+" ");
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
        System.out.println(a.isEmpty());

    }
}
