package SortingAlgorithms;

import java.util.Arrays;

public class mergeSort {
            /* the idea is , first divide the given array into two sub array and then keep faith on recursive
            * call to sort it, and finally merge them the whole array using merge method  */


    //  TC-  n.log n
    public static void main(String[] args) {
        int[] arr = {12, 1, 3,15};
      MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
      static void MergeSort(int [] arr,int left,int right ){

        // base case  when we get single size of array we need to return

        if(left>=right){
            return ;
        }
        int mid=(left+right)/2;  // divide--  o(log n)
        MergeSort(arr,left,mid);
        MergeSort(arr,mid+1,right);

        // merge method will merge  the two sorted array
        merge(arr,left,mid,right);    // conquer -- o(n)

    }
    static void merge(int [] arr,int left,int mid ,int right){

        int n1=mid-left+1;
        int n2=right-mid;
        int [] leftArr=new int [n1];
        int [] rightArr=new int [n2];
// extra space is taken . this is the draw-back of merge sort


        for(int i=0;i<n1;i++){
            leftArr[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j< n2){
            if(leftArr[i]<rightArr[j]){
               arr[k]=leftArr[i];
               i++;
               k++;
            }
            else{
                arr[k]=rightArr[j];
                k++;
                j++;
            }

        }
        // assigning the remaining element in  answer  array
        while(i< n1){
            arr[k]=leftArr[i]; 
            i++;
            k++;

        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }

        

    }
}
