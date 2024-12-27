package Queue;

public class linkedListImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
        public static class linkedQue{
            Node head;
            Node tail;
            int size=0;

            void add(int data){
                Node temp=new Node(data);
                if(head==null){
                   head=temp;
                }
                else{
                    Node t=head;
                    while(t.next!=null){
                        t=t.next;
                    }
                    t.next=temp;
                }
                size++;

            }
            void remove(){
                if(size==0){
                    System.out.println("List is empty ...");
                    return;
                }
                else{
                    head=head.next;
                }
            }
            int peek(){
                return head.data;
            }

            void print(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;

                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
    linkedQue l=new linkedQue();
        l.add(4);
        l.add(14);
        l.add(49);
        l.add(41);
        l.add(24);
        l.add(40);
        l.print();
        l.remove();
        l.print();
        System.out.println("peek of the list "+ l.peek());

    }
    }



