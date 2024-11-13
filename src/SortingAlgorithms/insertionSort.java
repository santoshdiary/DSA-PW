package SortingAlgorithms;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,20,15,12,16};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionSort(int [] arr){
        for(int i=0;i< arr.length-1;i++){ // i represent passes
            // traverse backward ;

            for(int j=i+1;j> 0;j--){  // j represent which element should be put on correct position
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else{
                    break;
                }
            }

        }
    }
}
