package Recursion;

public class main {

    static void PrintIncreasing (int n){
        if(n==1){
            System.out.println(1);
            return;

        }

        PrintIncreasing(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int a=5;
        PrintIncreasing(a);

    }

}
