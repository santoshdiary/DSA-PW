package SortingAlgorithms.Problems;

import java.util.Arrays;

public class sortArray {
    // sort a sorted array in which only two elements are interchanged with wrong place
    // input - 5,1,2,3,4,0   output- 0,1,2,3,5

    public static void main(String[] args) {
        int [] arr={ 1,2,5,4,3};
        SortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void SortArray(int [] arr){

        int n=arr.length;
        int x=-1;   // x is the first index that conflict wrong and y will be second conflict
        int y=-1;

        if(n<=1){
            return;  // edge case , corner case  must handle it for good programmer
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1; // 1st conflict
                    y=i;
                }else{
                    y=i;
                }
            }
        }
        // now just swap the found conflict indices

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
