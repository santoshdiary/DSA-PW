package linkedList;

public class MaxTwinSum {
    // find the maximum twin sum of a linked list of even length
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static int maxTwinSum(Node head){
     //edge case
        if (head == null || head.next == null) {
            return 0; // Edge case: empty or single-node list
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=slow;
        Node reversedNode= reverse(slow.next);

        slow.next=reversedNode; // linking reversed node
        Node temp1=head;
        int max=Integer.MIN_VALUE;
        while(temp.next!=null){
            if((temp1.data+temp.next.data)>max) {
                max = temp1.data + temp.next.data;

            }
            temp1=temp1.next;
            temp=temp.next;
        }
        return max;
    }
    static Node reverse(Node head){
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
    public static void main(String[] args) {
        Node a= new Node(3);
        Node b= new Node(1);
        Node c= new Node(5);
        Node d= new Node(9);
        Node e= new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println( maxTwinSum(a));
    }
}
