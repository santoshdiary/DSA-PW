package linkedList;

public class isPalindromeList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean isPalindrome(Node head){
        Node pre=null;
        Node Next=null;
        Node curr=head;
        while(curr!=null){
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
        Node temp=head;
        Node temp2=pre;
        while(temp!=null || temp2!=null){
            if(temp.data!= temp2.data)return false;
            temp=temp.next;
            temp2=temp2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node s=new Node(1);
        Node c=new Node(2);
        Node r=new Node(3);
        Node t=new Node(2);
        Node u=new Node(1);
        s.next=c;
        c.next=r;
        r.next=t;
        t.next=u;
        System.out.println(isPalindrome(s));
    }
}
