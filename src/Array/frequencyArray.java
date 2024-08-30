package Array;

import java.util.Scanner;

public class frequencyArray {
    // Q.  you hava given an array and a person ask you "n" times that "x" element is present in array or not ?
    // given that array doesn't contain more than 10 to the power 5 element .
    // we can solve this question via iterative search but ,it's inefficient algorithms

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int [] arr=new int [n];

        System.out.println("enter "+n+"elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] freq=makeFrequencyArray(arr);
        System.out.println("enter the number of queries");
        int q=sc.nextInt();
        while(q > 0){
            System.out.println("enter number to be searched :");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");

            }else{

                System.out.println("NO");
            }
            q--;

        }
    }
    static int [] makeFrequencyArray(int[] array){

        int [] freq=new int [100005]; // since array contain less than 10^5 element
        for(int i=0;i<array.length;i++){
            freq[array[i]]++; // default value of freq is zero but, when it iterates array of i index then it increases of value of freq.
        }
        return  freq;
    }


}
