package SortingAlgorithms;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] arr={5,0,6,2,1,3,4};
      //  countSortBasic(arr);
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void countSortBasic(int [] array){
        int MaxElement=findMax(array);
        int [] countArr= new int [MaxElement+1];  // frequency arr
        for(int i=0;i< array.length;i++){
            countArr[array[i]]++; // counting the frequency of element in array - see frequency array class
        }

        int k=0;
        for(int i=0;i<countArr.length;i++){
            for(int j=0;j<countArr[i];j++){
                array[k++]=i;
            }
        }

    }

    static void countSort(int [] arr){
        int n=arr.length;
        int [] output=new int[n];

        int MaxElement=findMax(arr);
        int [] countArr= new int [MaxElement+1];  // frequency arr
        for(int i=0;i< arr.length;i++){
            countArr[arr[i]]++; // counting the frequency of element in array - see frequency array class
        }
        // finding the prefix sum that help to find last correct idx of corresponding element
        for(int i=1;i<countArr.length;i++){
            countArr[i]+=countArr[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=countArr[arr[i]]-1;
            output[idx]=arr[i];
            countArr[arr[i]]--;

        }
        // copy all element of output to arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }


    }
    static int findMax(int [] arr){
        int max=Integer.MIN_VALUE;   // min. value of integer
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }

        return max;
    }
}
