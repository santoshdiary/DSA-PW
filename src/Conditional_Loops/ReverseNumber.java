package Conditional_Loops;

public class ReverseNumber {

    public static void main(String[] args) {
        int a=12789;

        int reverse=0;
        while(a>0){

            int digt= a%10;

            reverse=reverse*10+digt;
            a/=10;

        }
        System.out.println(reverse);

    }

}
