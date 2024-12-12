package linkedList;

public class doublyLinkedListMain {

   public static class  Node{
        int data;
        Node next;
        Node pre;
        Node(int val){
            this.data=val;
        }
    }
    static void printLL(Node head){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;

       }
    }
    static Node insertAtHead(Node head,int data){
       Node t=new Node(data);
       t.next=head;
       head.pre=t;
       head=t;
       return head;
    }
    static Node insertAtTail(Node head,int data){
       Node t=new Node(data);
       Node temp=head  ;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=t;

    return head;
   }
    public static void main(String[] args) {
       Node a=new Node(3);
       Node b=new Node(4);
       Node c=new Node(35);
       Node d=new Node(42);
       a.next=b;
       b.pre=a;
       b.next=c;
       c.pre=b;
       c.next=d;
       d.pre=c;
       printLL(a);
       System.out.println();
       Node q=  insertAtTail(a,12);
       printLL(q);
       // NOTE : so many operation can be done


    }
}
