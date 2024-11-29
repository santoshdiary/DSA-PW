package linkedList;

public class main {
    public static class Node{  // Node class is our custom data structure, that hava two attributes data and pointer of next node or address of next node
        int data;  // data of node
        Node next; // address of next node;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        // creating Nodes of linked list
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(1);
        Node d=new Node(5);
        Node e=new Node(3);

        // linking the nodes
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // address of node
        System.out.println(a);
        // getting data of node
        System.out.println(a.data);
        System.out.println(a.next.next.data);

        // print printing / getting data of linked list

        Node temp=a;  // a pointer node that pointing node "a";

        for(int i=0;i<5;i++){
            System.out.print(temp.data+",");
            temp=temp.next;
        }

        Node temp1=a;
        while(temp1!=null){
            System.out.println(temp1.data+",");
            temp1=temp1.next;
        }

    }

}
