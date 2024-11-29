package BinarySearch;

public class findInRotatedArr {
    // find the target element in rotated sorted array


    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,10,1,2,3};
        int [] duplicate={ 1,1,1,2,2,3,1};

        int target=1;
        int ans= findTarget(arr,target);
        System.out.println(ans);
        int ans1=SearchInDuplicateArr(duplicate,2);
        System.out.println(ans1);
    }
    static int findTarget(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<arr[end]){ // i.e. mid to end is sorted
                if(target>arr[mid] && target<=arr[end] ){ // i.e target lies between mid to end
                    start=mid +1;  //
                }
                else{
                    end=mid-1;
                }
            }
            else{
                // that means start to mid is sorted
                if(target>arr[start] && target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    // for duplicate element
    static int SearchInDuplicateArr(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[start]==arr[mid] && arr[end]==arr[mid] ){
                start++;
                end--;   // reducing search space ,  skipping same type of element
            }

            else if(arr[mid]<=arr[end]){
                if(target>arr[mid] && target<=arr[end] ){
                    start=mid +1;  //
                }
                else{
                    end=mid-1;
                }
            }
            else{
                // that means start to mid is sorted
                if(target>arr[start] && target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }


}
