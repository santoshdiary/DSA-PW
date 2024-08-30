package Array;

public class MaxNumber {

    public static void main(String[] args) {
        int [] roll={4,39,5,6,34};

     int maxNumber=max(roll);
        System.out.println(maxNumber);

        // for certain  interval

        int maxNumber2=max2(roll,3,roll.length-1);
        System.out.println(maxNumber2);
    }
    public static int max2(int []arr,int start ,int end){
        if(arr.length==0){
            return -1;
        }
        if(start>end){
            return -1;
        }

        int maxvla=arr[0];

        for(int i=start;i<=arr.length-1;i++){

            if(arr[i]>maxvla){
                maxvla=arr[i];

            }
        }

        return maxvla;
    }

    public static int max(int []arr){
        if(arr.length==0){
            return -1;
        }
        int maxvla=arr[0];

        for(int i=0;i<=arr.length-1;i++){

            if(arr[i]>maxvla){
                maxvla=arr[i];

            }
        }

        return maxvla;
    }

}
