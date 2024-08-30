package BinarySearch;

class CeilingNumber {

    // ceiling number is nothing but improved version of binary search because when while loop breaks (start becomes
    // more than end )  in that case we return "start index no". instead of -1; because start will become next greater element

    // ceiling number is the least integer number, greater than or equal to the given number.
    // in other  word, element equal to target or next greater element.
    // step 1 - find range of greater than or equal number ;
    // step 2 - the least number among them. =  ans

    public static void main(String []arg){
        int [] arr={3,5,6,10,12,15,44,91,100};
        int a=ceilingNumber(arr, 20);
        System.out.println(arr[a]);

    }

    static int ceilingNumber(int [] arr, int target){
        if( target>arr[arr.length-1]){
            return -1;

        }
       int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){

            return mid;
            }
            if(target>arr[mid]){
                start=mid+1;

            }else if(target<arr[mid]){
            end=mid-1;


            }else{
                return mid;
            }

        }
       return start;
    }

}