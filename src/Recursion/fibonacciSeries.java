package Recursion;

public class fibonacciSeries {


    static int fibo(int n){
        // base cases
        if(n==0 || n==1){
            return n;
        }

        // recursive work
       int n1= fibo(n-1);
       int n2= fibo(n-2);

        return n1+n2;


    }
    public static void main(String[] args) {

        System.out.println("Sixth fibonacci number");
        System.out.println(fibo(6));
        System.out.println("first 10 fibonacci no. ");
        for(int i=0;i<10;i++){
            System.out.println(fibo(i));
        }



    }
}
