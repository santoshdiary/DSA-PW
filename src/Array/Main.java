package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    // Syntax
    /*

    data_type [] reference_variable(nameOfArray)=  new data_type[size];

 see notes for complete clarity

    */

    public static void main(String[] args) {
     String [] arr= new String[4];
     int []santosh =new int[4];


        System.out.println(Arrays.toString(arr));


        System.out.println("Enter the Name of list:");
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        for(String name:arr){
            System.out.println(name);
        }
        System.out.println("Enter the Number of list:");
        for(int i=0;i<santosh.length;i++){

            santosh[i]=sc.nextInt();
        }
       for(int num:santosh){
           System.out.println(num);

       }


    }
}
