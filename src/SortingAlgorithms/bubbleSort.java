package SortingAlgorithms;

import java.util.Arrays;

public class bubbleSort {

    static void   BubbleSort(int [] arr){

     for(int i=0;i< arr.length;i++){
         boolean flag=false;   // for improving best case complexity in  o(n)
         for(int j=0;j< arr.length-1-i;j++){

            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true; // if array is already sorted then return for optimizing complexity in best case;
            }

            }
         if(flag){
             return;
         }

        }
        return;
    }
    public static void main(String[] args) {
        int[] arr={2,12,10,5,7,20, 3,22};
       BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
