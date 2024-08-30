package Array;

import java.util.Arrays;

public class TwoPointer {


   static int [] sort(int [] array){
       int Zeros=0;
       for(int i=0;i<array.length;i++){
           if(array[i]==0){
               Zeros++;
           }

       }
       for(int j=0;j<Zeros;j++){
           array[j]=0;

       }
       for(int k=Zeros;k<array.length;k++){

           array[k]=1;
       }

       return array;


   }

   static int [] SortWithSwap(int [] array){
       int left=0;
       int right=array.length-1;
     while(left<right){


         if(array[left]==1 && array[right]==0){
             swap(array,left,right);
             left++;
             right--;
         }
         // if already left and right position are correct then move pointers
         if(array[left]==0){
            left++;
         }
         if(array[right]==1){
             right--;

         }


     }

       return array;
   }

   static int [] swap(int [] array,int left,int right){
       int temp;

       temp=array[left];

       array[left]=array[right];
       array[right]=temp;


       return array;
   }

   static int [] SortEvenAndOdd(int []array ){
       int left=0;
       int right=array.length-1;
       while(left<right){


           if(array[left]%2==1 && array[right]%2==0){
               swap(array,left,right);
               left++;
               right--;
           }
           // if already left and right position are correct then move pointers
           if(array[left]%2==0){
               left++;
           }
           if(array[right]%2==1){
               right--;

           }


       }



       return array;
   }

    static int[] SortSquare(int[] array) {
        int n = array.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1;  // Start from the end of the ans array

        while (left <= right) {
            if (Math.abs(array[left]) > Math.abs(array[right])) {   // absolute value i.e. mode value. because minus value's square could be greater
                ans[k--] = array[left] * array[left];
                left++;
            } else {
                ans[k--] = array[right] * array[right];
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args ){
        int [] arr={1,0,0,1,0,0,0,0,0,1,1,1,0,0};
        // Question , Sort an array consist 0s and 1s

        //sort(arr);
       // SortWithSwap(arr);

       // System.out.println(Arrays.toString(arr));


        int [] array2 ={ 2,5,7,9,12,33,10,15,19};
        // sort this array so that all even no.move on left side and all odd no. move on right side
//        SortEvenAndOdd(array2);
//        System.out.println(Arrays.toString(array2));

        int [] arr3={-10,-3,-2,1,4,5};
        //  we have given a sorted array & we need to calculate of squares of each number sorted in non-decreasing order


       int [] ans= SortSquare(arr3);
        System.out.println(Arrays.toString(ans));


    }
}
