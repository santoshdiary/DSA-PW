package BinarySearch;

public class SearchInMountainArray {

    // we know the Mountain array has two part fist is ascending order part , then descending order part that's why
    // if we want to search an element on this then, we can search simply search in these part one by one.

    public static void main(String[] args) {
    int [] arr= {1,2,3,4,5,6,7,5,3,2,1,0};
    int target=0;
    int ans=search(arr,target);
        System.out.println(ans);

    }

    static int search(int []array, int target){
        int peak=peak(array);
        int firstTry=OrderAgnosticBs(array,target,0,peak); // this is searching BS in left side of array
        if(firstTry!=-1){ // condition that whether element found in fistTry or not  , if not that means element may be in descending aprt
            return firstTry;
        }
        return OrderAgnosticBs(array,target,peak+1,array.length-1); // this is Searching BS in right side of array
    }
    static int peak(int [] array){
    int start=0;
    int end=array.length-1;
    while(start<end){
        int mid=start+(end-start)/2;
        if(array[mid]<array[mid+1]){
            // ascending side of array

            start=mid+1;

        }
        else{
            //  descending part of array

            end=mid;
        }
    }
    return end; // start=end
    }
    static int OrderAgnosticBs(int [] array, int target,int start,int end ){
        // checking whether array ascending or descending
        boolean ascending= (array[start]<array[end]);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            if(ascending){
                if(target<array[mid]){
                    end=mid-1;
                }
                else if(target>array[mid]){
                    start=mid+1;

                }else{
                    return mid;
                }

            }else {
                // for descending order
                if(target>array[mid]){
                    end=mid-1;
                }
                else if(target<array[mid]){
                    start=mid+1;
                }

            }

        }
        return -1;

    }

}
