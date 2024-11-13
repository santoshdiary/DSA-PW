package SortingAlgorithms.Problems;

import java.util.Arrays;

public class arrangePositiveNegativeNo {
    public static void main(String[] args) {
        int [] arr={ 0,2,3,-1,4,-2,-4,5,-7};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void arrange(int [] arr){
       int n=arr.length;
       int s=0;
       int e=n-1;
       while(s<=e){
           while(arr[s]<0) s++;  // imagine like partition  method in which 0 be pivot
           while(arr[e]>=0)e--;

           if(s<=e){
               // swap

               int temp=arr[s];
               arr[s]=arr[e];
               arr[e]=temp;
           }

       }
    }
    static void swap(int []arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
