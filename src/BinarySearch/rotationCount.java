package BinarySearch;

public class rotationCount {

    // {2,4,5,6,7,8,9,10,12} --> after 4 rotation {8,9,10,12,2,3,4,5,6,7 } here 12 is "pivot"
    public static void main(String[] args) {
    int [] arr={8,9,10,12,2,3,4,5,6,7 };
    int ans=findPivot(arr);
        System.out.println(ans+1); // because rotation count =pivot index +1;
    }
    static int findPivot(int [] array){
        int start=0;
        int end=array.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(mid<end && array[mid]>array[mid+1]){
                return mid;
            }
            if(mid>start && array[mid]<array[mid-1]){
                return mid-1;

            }
            else if(array[mid]<array[start]) {
                end=mid-1;
            }else{
                start=mid+1;

            }
        }
        return -1;
    }

}
