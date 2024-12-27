package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); // queue is implemented via either LinkedList or ArrayDequeue
        Queue<Integer> q1=new ArrayDeque<>();

        q.add(7);
        q.add(6);
        q.add(67);
        q.add(34);
        q.add(1);
        q.add(27);
        q.add(70);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println( q.peek());
        q.poll(); // remove
        System.out.println(q);
        System.out.println("size of queue "+q.size());
        // we can perform more operation in this inbuilt queue.

        // printing the queue using add,remove ,peek or size method ;
        int size=q.size();

        for(int i=0;i<size;i++){
            int x=q.remove();
            System.out.print(x+",");
            q1.add(x);
        }
        for(int i=0;i<size;i++){
            int x=q1.remove();
            q.add(x);
        }




    }
}
