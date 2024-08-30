package Conditional_Loops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int ans = 0 ;
        while (true) {
            System.out.println("Enter your operator:");

            char op = sc.next().charAt(0);
            // string-->char
            // there is no direct method of taking char input from user we can use next.().charAt(0) for taking user input of char
            // here charAt (0) that means String's 0 index character .


            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter two Numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }else{
                        System.out.println("Can't be divide by Zero ");
                        continue;
                        // continue keyword word , only this if statement
                    }


                }
                if(op=='%'){
                    ans=a%b;
                }


            }
            else if(op=='x'|| op=='X'){
                break;
            }
            else{
                System.out.println("Invalid operator Enter something else ");

            }

            System.out.println(ans);
        }


    }

}