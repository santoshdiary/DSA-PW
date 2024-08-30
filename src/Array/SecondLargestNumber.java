package Array;

public class SecondLargestNumber {
    public static void main(String[] args) {
    int [] arr={4,6,3,5,8,2};
    int ans=secondMax(arr);
        System.out.println(ans);

    }
    static int secondMax(int [] array){
       int max= findMax(array);
       array[max]=Integer.MIN_VALUE;
       int ans=findMax(array);
       return ans;

    }
    static int findMax(int[] array){
        int ans=0;
        int i=1;
        while(i<array.length){

            if(array[i]>array[0]){
                ans=i;
            }
            i++;
        }
       return ans;
    }
}
