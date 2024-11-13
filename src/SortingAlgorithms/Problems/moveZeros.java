package SortingAlgorithms.Problems;

import java.util.Arrays;

public class moveZeros {

    // move all zeros to the end without changing the order of array
    public static void main(String[] args) {
    int [] arr={0,5,0,3,4,2}; // ans- 534200
    move(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void move(int [] arr){
        for(int i=0;i<arr.length;i++){

            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0 ){  // we want to move all zero at the end.eg.  0 and 3 then swap
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
}
