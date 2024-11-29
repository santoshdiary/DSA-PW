package BinarySearch;

public class MinInRotatedArr {
    // question is find minimum element's index  in a rotated array ;

    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,10,1,2,3}; // out put =  index 6
        int idx=min(arr);
        System.out.println(idx);
    }
    static int min(int [] arr ){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){

            int mid=start +(end-start)/2;
            if(arr[mid]<=arr[end]){
                // it may be our answer  so assigning to ans, but note that ans also be in left side;
                ans=mid;
                end=mid-1;
            }
            else{
                // that mean we are in 1st sorted array, since ans can be founded in  2nd sorted array
                // move to 2nd  sorted array
                start=mid+1;
            }



        }
        return  ans;
    }
}