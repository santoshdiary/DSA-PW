package Method;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        boolean ans =isPrime(num);
        System.out.println(ans);


        // checking three digit no that whatever isArmStorng or not
//            for(int i=100; i<1000;i++){
//             if( isArmStrong(i)){
//                 System.out.println(i+" ");
//                }
//
//            }

    }

    private static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        int n=2;

        while(num>n){
            if(num%n==0){
                return false;
            }
            n++;

        }

        return true;

    }

    public static boolean  isArmStrong(int n){
         /*  A ArmStrong Number is a special type of number in which , when we take individual digit of given numbers and
          power with no of digits in that then, the sum of each term gives again that no.

          */

        // eg. - 153  --->  1^3 +5^3+3^3= 153
        int original =n;
        int sum=0;

        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n/=10;

        }
        return  sum==original;

    }


}
