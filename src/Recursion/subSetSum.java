package Recursion;

public class subSetSum {

    static void subSetSum(int [] arr,int idx,int sum){
        if(idx>=arr.length){
            System.out.print(" "+sum);
            return ;
        }
        subSetSum(arr,idx+1,sum+arr[idx]); // include
        subSetSum(arr,idx+1,sum); //exclude

    }
    public static void main(String[] args) {
        int [] arr={2,4,5};
      subSetSum(arr,0,0);
    }
}
