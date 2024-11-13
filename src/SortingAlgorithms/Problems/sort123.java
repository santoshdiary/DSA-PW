package SortingAlgorithms.Problems;

import java.util.Arrays;

public class sort123 {
    public static void main(String[] args) {
        int [] arr={ 1,0,0,2,0,1,1,0,2,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        sortViaCountApproach(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){   // optimized
        int lo=0,mid=0,hi= arr.length-1;
        // explore unknown region
        while (mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                mid++;
                lo++;


            }
            else if(arr[mid]==1) {
                mid++;
            }
             else {
                 swap(arr,mid,hi);
                 hi--;
            }

        }
    }
    static void swap(int []arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
       arr[y]=temp;
    }
    static void sortViaCountApproach(int [] arr){ // not optimised bc we have to two passes
      int i=0;
      int count0=0;
      int count1=0;
      int count2=0;
        while(i<arr.length){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }
            i++;
        }
        for(int j=0;j<=count0-1;j++){
            arr[j]=0;
        }
        for(int j=count0;j<=count0+count1-1;j++){
            arr[j]=1;
        }
        int n=arr.length;
        for(int j=count0+count1;j<n;j++){
            arr[j]=2;
        }




    }
}
