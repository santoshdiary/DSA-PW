package Recursion;

public class sumOfArray {

    static int ArraySum(int [] arr, int idx){
        if(idx== arr.length){
            return 0;
        }
        int smallAns=ArraySum(arr,idx+1);
        return arr[idx]+smallAns;

    }
    public static void main(String[] args) {
        int []data={1,2,3,4,5};
        System.out.println(ArraySum(data,0));
    }
}
