package Array;

import java.util.*;
public class PrefixSumQue {


    static int [] prefixSum(int [] array){
        // prefix sum that means sum of all element from index0 to given index ;

        int n=array.length;

        for(int i=1;i<n ;i++){     // loop start from index 1 because index 0 is will not change.

           // array[i]=array[i-1]+array[i];
            array[i]+=array[i-1];
        }
        return array;
    }
    static int findArraySum(int [] array){


        int totalSum=0;

        for(int i=0;i<array.length;i++){
            totalSum +=array[i];
        }

        return totalSum;
    }

    static boolean equalSumPartition(int []array){   // can I divide an array into to sub array ?
       int totalSum=findArraySum(array);

       int prefSum=0;
       for(int i=0;i<array.length;i++){
           prefSum+=array[i];

           int suffixSum=totalSum-prefSum;

           if(suffixSum==prefSum){
               return true;
           }

       }
        return false;
    }
    public static void main(String[] args) {
//        int [] arr={1,34,12,45,56,22};
//
//        prefixSum(arr);
//
//         System.out.println("Prefix sum array  "+Arrays.toString(arr));
        Scanner  sc =new Scanner(System.in);
//        System.out.println("enter number of queries:");
//        int q=sc.nextInt();
//        while(q-->0){  // while q < 0 as well decreasing the value
//
//            System.out.println("Enter the rage:");
//            int l=sc.nextInt();
//            int r=sc.nextInt();
//
//            int ans=arr[r]-arr[l-1];
//            System.out.println("Sum: "+ans);


        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr2=new int [n];
        System.out.println("Enter "+ n + " element ");
        for(int i=0;i<n;i++){
        arr2[i]=sc.nextInt();
        }

      boolean ans =  equalSumPartition(arr2);
        System.out.println("Possibility of equal sum partition of given array :"+ans);






    }
}
