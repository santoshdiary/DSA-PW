package Conditional_Loops;

import java.util.Scanner;

public class CheckCase {

    public static void main(String[] args) {

// Q check the entered character is lowe or upper case
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);

        if(ch >= 'a' &&  ch <='z'){   // comparing the range of lower case letter

            System.out.println("Lower case ..");
        }else{

            System.out.println("Upper case....");
        }
//        char b='s';
//        b++;
//        System.out.println(b);
//        char c='S';
//        c++;
//        System.out.println(c);



    }
}
