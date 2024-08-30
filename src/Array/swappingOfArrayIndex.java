package Array;

import java.util.Arrays;

public class swappingOfArrayIndex {

    public static void main(String[] args) {
        int [] arr={3,4,42 , 34,223, 38,90};
        System.out.println(Arrays.toString(arr));
        swap(arr,3,5);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int [] arr,int index1,int index2){
        int tem;
        tem=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tem;

    }
}
