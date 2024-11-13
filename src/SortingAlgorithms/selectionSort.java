package SortingAlgorithms;

import java.util.Arrays;

public class selectionSort {

    static void SortSelection1(int [] arr){    // using max element and swapping it on correct place
        for(int i=0;i<arr.length;i++){
            int maxIdx=0;
            int lastIdx= arr.length-i-1;
            for(int j=0;j<=lastIdx;j++){       // finding max element's idx
                if(arr[j]>arr[maxIdx]){
                    maxIdx=j;
                }
            }
            // swapping
            int temp=arr[lastIdx];
            arr[lastIdx]=arr[maxIdx];
            arr[maxIdx]=temp;

        }
    }
    static void SortSelection2(int [] arr){ // using min element and correcting its place
        for(int i=0;i<arr.length-1;i++){ // i iteration represent which  element we want to correct
            int minIdx=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            // swap
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {

        int [] arr={44,1,22,0,18,5,12,10};
       // SortSelection1(arr);
        SortSelection2(arr);
        System.out.println(Arrays.toString(arr));

    }



}
