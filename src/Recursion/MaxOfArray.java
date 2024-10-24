package Recursion;

public class MaxOfArray {

    static int maxInArray(int [] arr,int idx){
        // base case
        if(idx==arr.length-1){
            return arr[idx];
        }
        // small problem -> idx+1 ,end of the array -> max
        int smallAns=maxInArray(arr,idx+1);

        // self work
        return Math.max(arr[idx],smallAns); // comparison

    }
    public static void main(String[] args) {
        int [] data={12,33,11,23,1,45,5};
        int a= maxInArray(data,0);
        System.out.println(a);
    }
}
