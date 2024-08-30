package Array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr={2,3,4,55,6,8,9};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int [] array){

        int start=0;
        int end=array.length-1;
        while(start<end){
           swap(array,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int []arr,int index1,int index2){
        int tem;
        tem=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tem;



    }
}
