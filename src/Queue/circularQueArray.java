package Queue;

public class circularQueArray {

    public static class queueArray{
        int [] arr;
        int rear;
        int front;
        int size;
        int n=0;
        queueArray(int size){
            this.size=size;
            front=rear=-1;
            arr=new int[size];
        }


        void addElement(int val){
           if(n==size){
               System.out.println("queue is full ...");
               return ;
           }
           else if( n==0){
             front=rear=0;
             arr[0]=val;
             n++;

           }else if(rear<size-1){

               arr[++rear]=val;
               n++;
           }
           else if(rear==size-1){ // if rear reach last index bc size is not empty
               rear=0;
               arr[0]=val;
               n++;
           }

        }
        int removeElement(){
            if(rear==-1){
                System.out.println("Queue is empty ....");
                return -1;
            }
            else{
                int val=arr[front];
                if(front==size-1){
                    front=0;
                }
                else {
                    front++;
                }
                return val;
            }

        }
        int Peek(){
            return arr[front];
        }
        void display(){
            if(n==0){
                System.out.println("queue is empty ..");
                return;
            }
           if(front<=rear){
               for(int i=front;i<=rear;i++){
                   System.out.print(arr[i]+" ");
               }
           }
           else{
               for(int i=front;i<=size-1;i++){
                   System.out.print(arr[i]+ " ");
               }
               for(int i=0;i<=rear;i++){
                   System.out.print(arr[i]+ " ");
               }
           }
        }
    }
    public static void main(String[] args) {
       queueArray s=new queueArray(5);
       s.addElement(51);
        s.addElement(25);
        s.addElement(35);
        s.addElement(50);
        s.addElement(53);
        s.display();



    }
}
