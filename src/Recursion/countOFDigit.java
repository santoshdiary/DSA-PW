package Recursion;

public class countOFDigit {

    static int countDigit(int n){

        // just n/10  calculate using recursive function  and  add last one digit in count using self work

        if(n>=0 && n<=9){
            return 1;
        }
        int count=0;

     count=countDigit(n/10)+1;

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countDigit(1235423324));
    }

}
