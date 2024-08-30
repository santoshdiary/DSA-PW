package Conditional_Loops;

import java.util.Scanner;

public class FibonachiSeries {
    // 0 1 1 2 3 5 8 ....


    public static void main(String[] args) {

        System.out.println("Enter n of series :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;




        }




    }



}
