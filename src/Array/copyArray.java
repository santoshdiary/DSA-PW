package Array;

import java.util.Arrays;

public class copyArray {

    // directly we can't copy of an array into a different array . if we do it then different copy is not made instead of
    // just a new reference variable is created .
    // for copying an array into a different array we need use "clone method "
    public static void main(String[] args) {
        int [] arr={2,4,6,7,886,3,6};
        int [] arr2=arr;
       // print(arr2);
       // arr2[3]=5; // shallow  copy
        // since we change in arr2 but, it reflects on arr1 because arr1 and arr2 both are same but different reference variable

        print(arr);

        // for copy in different array we just use clone method

        int [] arr3=arr.clone();
       // print(arr3);
        arr3[3]=5;
        //print(arr3);
        // or
        arr3= Arrays.copyOf(arr,4);
        print(arr3);

    }
    static void print(int [] array){
    for(int a:array){
        System.out.print(a+",");
    }
        System.out.println();
    }
}
