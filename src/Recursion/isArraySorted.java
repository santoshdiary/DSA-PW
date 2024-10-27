package Recursion;

public class isArraySorted {
    static boolean isArraySorted(int [] arr,int idx){
        if(idx>=arr.length-2){
            return true;
        }
        boolean smallAns=false;
        if(arr[idx]<arr[idx+1]){
         smallAns = isArraySorted(arr,idx+1);
        }
        return  smallAns;
    }
    public  static void main(String [] args){

        int [] arr={4,6,7,9,1,10};
        int [] arr1={1,2,3,4,5};
       // System.out.println(isArraySorted(arr,0));
        System.out.println(isArraySorted(arr,0));

    }
}
