package Queue;

public class ArrayImplementation {
    public static class queueArray{
        int [] arr;
        int rear;
        int front;
        int size;
        queueArray(int size){
            this.size=size;
            front=rear=-1;
            arr=new int[size];
        }


        void addElement(int val){
            if(rear==size-1){
                System.out.println("queue is full ...");
                return;
            }
            if(rear==-1){
                rear++;
                arr[rear]=val;
                front++;
            }
            else{
                rear++;
                arr[rear]=val;
            }

        }
        void removeElement(){
            if(rear==-1){
                System.out.println("Queue is empty ....");
                return;
            }
            front++;
        }
        int Peek(){
            return arr[front];
        }
        void display(){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueArray q=new queueArray(5);
        q.addElement(5);
        q.addElement(6);
        q.addElement(7);
        q.addElement(4);
        q.display();


    }
}
