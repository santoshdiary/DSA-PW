package BinarySearch;

public class MountainArray {

      /* Q. Mountain array is a special type of sorted array in which element firstly increases then decrease.
                    { 1,2,3,4,5,6,5,4,3,2,1} peak element =6; that is the
                    Q. to find out  the peak element of mountain array
        */


    public static void main(String[] args) {
        int [] arr= { 1,2,3,4,5,6,5,4,3,2,1};
        int ans=MountainSearch(arr);
        System.out.println(ans);

    }

    static int MountainSearch(int [] array ){
        int start=0;
        int end=array.length-1;
        while(start<end){
        int mid=start=(end-start)/2;
         if(array[mid]>array[mid+1]){
             // that means we're on  descending part of array
             // this may be the ans, but look at left
             // this is why end != mid - 1
            end=mid;

            }
         else{
             // that means we're on ascending part of array
             start=mid+1;
         }
        }
        return end ;// you can return end because start=end;
    }

}
