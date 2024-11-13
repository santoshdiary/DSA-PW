package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int [] arr= { 3,5,1,0,4,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int [] arr,int st,int en){
        if(st>=en){
            return;
        }
        int PI=partition(arr,st,en); // pivot index
        quickSort(arr,st,PI-1);
        quickSort(arr,PI+1,en);
    }
    static int partition(int [] arr,int st,int en){
        int pivot=arr[st];
        int count=0;

        // counting the number of element which is lesser than pivot element so that we can find out correct position of pivot
        for(int i=st+1;i<=en;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotInx=count+st;   // found  correct   index of pivot, yani pivot ki right index (st+count) pe hai
        swap(arr,pivotInx,st); //  swap for correct  positioning of pivot

        int i = st, j=en;
        // element lesser left side, greater - right side  of pivot
        while(i<pivotInx && j>pivotInx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<pivotInx && j>pivotInx){
                swap(arr,i,j);
                i++;
                j--;
            }

        }
        return pivotInx;
    }
    static void swap(int []arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
}
