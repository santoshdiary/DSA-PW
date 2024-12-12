package linkedList;

public class circularLinkedList {
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private Node tail;
    circularLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int val){
        Node node =new Node(val);
        if (head == null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    void display(){
        Node node=head;
        if (head!=null){
            do{
                System.out.print(node.val+" -> ");
                node=node.next;
            }while(node!=head);
        }
    }

    void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if (node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if (n.val == val) {

                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);

    }




    public static void main(String[] args) {
        circularLinkedList list=new circularLinkedList();
        list.insert(6);
        list.insert(65);
        list.insert(45);
        list.insert(8);
        list.insert(36);
        list.display();
        list.delete(8);
        System.out.println();
        list.display();

    }
}
