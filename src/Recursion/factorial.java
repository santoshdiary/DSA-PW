package Recursion;

public class factorial {


    static int fact(int n){
        // base case
        if(n==0){
            return 1;
        }

        // recursive work
       int smallerAns= fact(n-1);

        // self work
        return n*smallerAns;



    }
    public static void main(String [] args){
        System.out.println(fact(6));

    }

}
