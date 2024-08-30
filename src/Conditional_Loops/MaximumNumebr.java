package Conditional_Loops;
import java.util.Scanner;

public class MaximumNumebr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter three Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        int max=a;
        if(b>a){
            max=b;
        }
       if(c>b){
           max=c;
       }
        System.out.println("Largest  Number is: " +max);



    }


}
