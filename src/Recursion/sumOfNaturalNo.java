package Recursion;

public class sumOfNaturalNo {

    static int sum(int n){
        // 1+2+3+4......+n




        // base case
        if(n==0){
            return 0;
        }

       return  sum(n-1)+n;
        // recursive work and self work
    }

    static int sumOfAlt(int n){
        // 1-2+3-4+5....
        // note-odd number is added and even no.  is subtracted

        if(n==0){
            return 0;
        }
        if(n %2 == 0){

            // even case
            return sumOfAlt(n-1)-n;
        }

        return sumOfAlt(n-1)+n;

    }


    public static void main(String[] args) {
        System.out.println(sum(5)); // 5+4+3+2+1
        System.out.println(sumOfAlt(3)); // 1-2+3
    }
}
