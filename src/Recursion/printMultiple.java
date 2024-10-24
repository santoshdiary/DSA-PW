package Recursion;

public class printMultiple {

    static void printMult(int n,int k){
        // base case

        if(k==1){
            System.out.println(n);
            return ;
        }
        // recursive work
        printMult(n,k-1);

        // self work
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        printMult(5,1);

    }
}
