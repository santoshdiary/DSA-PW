package BinarySearch;

public class InfiniteArray {
    // Infinite array that means search element without using index

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        int target= 90;
        System.out.println(ans(arr,target));
    }
    static int ans(int [] arr, int target){
        // the idea is we do just opposite of binary search: increase search range in every step and compare.
        int start=0;
        int end=1;

        // condition of target element to lie int the range.
        while(target>arr[end]){

            int temp=end+1; // this my new start
            // end=end+sizeOfBox*2;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int [] arr, int target,int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                return mid;
            }
        }
        return -1;
    }


}
