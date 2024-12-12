package linkedList;

public class reverseLInkedList {
  public static class Node{
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
    static Node reverseLL(Node head){  // iterative method
      // In starting - Next and previous pointer pointing null and current pointing head of list
      Node curr=head;
      Node pre=null;
      Node Next=null;
      while(curr!=null){
          Next=curr.next;
          curr.next=pre; // curr.next pointing null i.e. breaking the connection and building backward connection
          // updating the pointers
          pre=curr;
          curr=Next;
      }
      return pre; 
    }

    public static Node reverseLLRecursion(Node head){
      if(head==null || head.next==null  ) return head;
      Node newHead=reverseLLRecursion(head.next); //recursive work
      head.next.next=head; // interchanging the connections,  self work
      head.next=null;
        return newHead;
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
//        printLL(reverseLL(s));
//        System.out.println();
        Node P=reverseLLRecursion(s);
        printLL(P);


    }
}
