package linkedList;

public class implementation {

    public static class Node{   //creating Node data type
        int data;
        Node next;


        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{   // creating linked list data structure;
        Node head;;
        Node tail;
        int size=0;

        // creating method for inserting element in end

        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else
            {
                //  means already some element in the list
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

        // method that print list

         void printLL(){
            Node temp=head;   // pointer node which pointing head node 
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }

       
        void insertAtBeginning(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;

            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void deleteFirst(){
            if(head==null) {
                System.out.println("Empty list , nothing to delete ...") ;
                return;
            }else{
                head=this.head.next;
                size--;
            }

        }
        void deleteLast(){
            if(head==null) {
                System.out.println("Empty list , nothing to delete ...") ;
                return;
            }
            size--;
            if(head.next==null)
            {
                head=null;
                return;
            }
            Node temp=head;

            while(temp.next.next!=null){   // until second last node
                temp=temp.next;

            }
            temp.next=null;
            tail=temp;
        }

    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(8);
        ll.insertAtEnd(12);
        ll.insertAtBeginning(100);
        ll.printLL();
        System.out.println();
      // System.out.println("size ="+ ll.size);


       // ll.deleteFirst();
        ll.deleteLast();
        ll.printLL();


    }
}
