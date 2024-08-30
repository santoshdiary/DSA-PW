package Array;

import java.util.Arrays;

public class swap {

    static int [] rotateArray(int [] array, int k){
        // Q. rotate given array of  given times. here times could be greater than length of given array

        int n=array.length;
        k=k%n;    // % is used because after n rotation, array repeat itself.

        int [] ans=new int [n];

        int j=0;

        // putting element from index n-k of given array to ans. array from index zero.
        for(int i=n-k;i<n;i++){
           ans[j++] =array[i];


        }

        // putting element from index 0 of given array to ans. array from index after previous index of ans array's index.
        for(int i=0;i<n-k;i++){
            ans[j++] =array[i];


        }
        return ans;

    }

    static int [] rotateWithoutExtraSpace(int [] array,int k){

        // Q. reverse the given array without using another array because another array increase the space complexity
      int n=array.length;
      k=k%n;
       reverseArray(array,0,n-k-1);
       reverseArray(array,n-k,n-1);
       reverseArray(array,0,n-1);
       return array;
 // hints :
  /*  first of all we reverse the first part of array ,then second and finally reverse whole array
  *  you know,  reverse of reverse = original
  *  */


    }
    static int [] ReverseArray(int [] array){

        // using iterative method

        int n=array.length;
        int [] ans=new int[n];
        int index=0;
        for(int i=n-1;i>=0;i--){
            ans[index]=array[i];
            index++;


        }
        return ans;

    }
    static int [] reverseArray(int [] arr,int indexFront,int indexBack){
        // using swapping

       while(indexFront<indexBack){

           int temp=arr[indexBack];
           arr[indexBack]=arr[indexFront];
           arr[indexFront]=temp;
           indexBack--;
           indexFront++;
       }
        return arr;

    }


    static void swap(int a, int b){
        System.out.println("Original value before swap");
        System.out.println(a);
        System.out.println(b);

        int temp=a;  // here temp is a another temporary variable that temporarily store the value of a
        a=b;
        b=temp;


        System.out.println(" value after swap");
        System.out.println(a);
        System.out.println(b);
    }
    static void swapWithoutTemp(int a, int b){

        // q. swap the given no without using any other variable like temp tec.

        System.out.println("Original value before swap");
        System.out.println(a);
        System.out.println(b);

        a=a+b;
        b=a-b; // (a+b)-b= a which is changed value of b;
        a=a-b; // (a+b)-b(changed value of b i.e. a )

        System.out.println(" value after swap");
        System.out.println(a);
        System.out.println(b);

    }



    public static void main(String[] args) {
        int a=9;
        int b=3;
        int [] arr={1,2,3,4,5};
      //  swap(a,b);
       // swapWithoutTemp(a,b);

//      int [] ans=  ReverseArray (arr);
//        System.out.println(Arrays.toString(ans));
 //       int[] ans=reverseArray(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(rotateArray(arr,33)));
//        System.out.println(Arrays.toString(rotateWithoutExtraSpace(arr,3)));


    }
}
