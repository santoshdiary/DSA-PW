package BinarySearch;

public class binarySearchRecursion {
    // Binary search using recursion



    public static void main(String[] args) {
        int [] santosh={-4,-3, 0,3,4,5,6,45,89,400,999,43553,56366337};
       int ans= binarySearch(santosh,0,santosh.length-1,1000);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr,int st,int en, int target){
           if(st>en){
               return -1;
           }
           int mid=st+(en-st)/2;
           if(arr[mid]==target){
               return mid;
           }
           if(target<arr[mid]){
             //   en=mid-1
            return   binarySearch(arr,st,mid-1,target);
           }
           return binarySearch(arr,mid+1,en,target);

    }

}
