package Array;

import java.util.Arrays;

public class passingFunction {

    public static void main(String[] args) {
        int [] arr={3,4,3,53,23,43,4};
        System.out.println(Arrays.toString(arr));


        change(arr);



        System.out.println(Arrays.toString(arr));


    }
    public static void change(int []arr){

        arr[3]=56;
    }
}
