package Recursion;

public class sumOfDigit {

    static int digitsum(int n){
            // base case
        if(n>=0 && n<=9){

            return n;
        }

        int smallAns=digitsum(n/10);
        return smallAns+n%10;



    }
    public static void main(String[] args) {

        System.out.println(digitsum(1235));
    }
}
