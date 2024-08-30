package BinarySearch;

public class floorNumber {

    // floor number is the greatest number , smaller or equal to target
    // in other word - element equal to target or previous (less than ) element

    // step-1 : identify smaller than or equal  range of target element
    // step-2 : greatest number among them

    public static void main(String []arg){
        int [] arr={3,5,6,10,12,15,44,91,100};
        int a=floorNumber(arr, 13);
        System.out.println(arr[a]);

    }

    static int floorNumber(int [] arr, int target){

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
        return end;
    }

}
