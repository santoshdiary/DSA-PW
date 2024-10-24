package Recursion;

public class RecursionONArray {
    static void printArray(int[] arr,int idx){
        // base case
        if(idx==arr.length){
            return;
        }

        // self work
        System.out.print(arr[idx]+" ");

        //recursive work  - sub problem
        printArray(arr,idx+1);

    }

    public static void main(String[] args) {
        int [] data={12,33,11,23,1,45,5};
        printArray(data,0);
    }
}
