package Array;

public class targetSum {

    public static void main(String[] args) {
        int [] arr={4,6,3,5,8,2};
       int  targetSum =7;
     int a=  targetSum(arr,targetSum);
        System.out.println(a);

    }
    static int targetSum(int [] array, int target ){
        int cout=0;

        for(int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){
               if(array[i]+array[j]==target){
                   cout++;
               }
            }
        }

        return cout;
    }
}
