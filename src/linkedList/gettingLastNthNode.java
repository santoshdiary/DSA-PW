package linkedList;

public class gettingLastNthNode {

  public static class Node{
      int data;
      Node next;
      Node(int data){
          this.data=data;
      }
        // getting node nth node from backward
      static Node gettingLastNthNode(Node head,int idx){
          int size=0;
          Node temp=head;
          while(temp!=null){
              size++;
              temp=temp.next;

          }
          int forwardIdx=size-idx+1;
          Node temp2=head;
          for(int i=1;i<=forwardIdx-1;i++){
              temp2=temp2.next;

          }
          return temp2;


      }
      public static Node gettingLastNthNode2(Node head,int idx){
          // in a single traversal

          Node slow=head;
          Node fast=head;

          for(int i=1;i<=idx;i++){
              fast=fast.next;
          }
          while(fast!=null){
              slow=slow.next;
              fast=fast.next;
          }
          return fast;
      }
    public static void deleteNodeFromLast(Node head,int backIdx){
          Node slow=head;
          Node fast=head;
          for(int i=1;i<=backIdx;i++){
              fast=fast.next;

          }
          while(fast.next!=null){
              slow=slow.next;
              fast=fast.next;
          }
          slow.next=slow.next.next;
    }
        static void displayList(Node head){
         Node temp=head;
          while(temp!=null){
              System.out.print(temp.data+" ");
              temp=temp.next;
          }
            System.out.println();
        }
      public static void main(String[] args) {
          Node a=new Node(2);
          Node b=new Node(32);
          Node c=new Node(23);
          Node d=new Node(122);
          Node e=new Node(20);

          a.next=b;
          b.next=c;
          c.next=d;
          d.next=e;
//          Node q=gettingLastNthNode(a,3);
//          Node p=gettingLastNthNode2(a,3);
//          System.out.println(q.data);
//          System.out.println(p.data);
          displayList(a);
          deleteNodeFromLast(a,3);
          displayList(a);


      }
  }
}
