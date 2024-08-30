package Array;

import java.util.Scanner;

public class frequenceyArray {

    public static void main(String[] args) {
    // question is we hava an array and "n" queries   to be searched  that given input present in array or not
    // Point is we can use normal iteration and comparison  but, here n can be too large that case iterative method will be inefficient
    // that's why we use another array called frequency array that contain 10^5 index,
    // we traverse in given array and increase value of frequency array's index value. for quick access .     



         Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int [] arr=new int [n];

        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        int [] freq=makefrequecyArray(arr);
        System.out.println("Enter number of queries");
        int q=sc.nextInt();


        while(q>0){
                q--;
            System.out.println("Enter number to be searched:");
            int x=sc.nextInt();
            
            if(freq[x]>0){
                System.out.println("YES present");
            }
            else{
                System.out.println("NO present");
            }

        }


    }
    static int [] makefrequecyArray(int [] arr){


        int [] freq=new int[1000005]; // size of freq. array is given 10^5 or less

        for(int i=0;i<arr.length;i++){

            freq[arr[i]]++;
        }

        return freq;
    }



}
