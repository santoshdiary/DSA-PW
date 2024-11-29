package linkedList;

public class displayLL {

    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }



    }

    static void printLL(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    // print linked list using recursion
    static void pirntR(Node head){
        // base case;
        if(head==null){
            return;
        }
        System.out.print(head.data +" ");
        pirntR(head.next);
    }

    public static void main(String[] args) {
        Node s=new Node(1);
        Node c=new Node(4);
        Node r=new Node(0);
        Node t=new Node(12);
        Node u= new Node(13);
        s.next=c;
        c.next=r;
        r.next=t;
        t.next=u;
        printLL(s);
        System.out.println();
        pirntR(s);

    }
}
