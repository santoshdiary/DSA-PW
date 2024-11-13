package BinarySearch;

public class Main {

    public static void main(String[] args) {

        int [] santosh={-4,-3, 0,3,4,5,6,45,89,400,999,43553,56366337};

        // array element must be shorted before performing binary search
        int indexFound= binarySearch(santosh,89);
        System.out.println("element founded on index "+ indexFound);


    }

    public static int binarySearch(int [] array, int target ){


        int start=0;
        int end=array.length-1;
        while(start<=end){

           // int mid=(start+end)/2;  // this is problem , it becomes out of range so, advance way

             int mid=start+(end-start)/2;

            if(target<array[mid]){
                // that means element present in left side of mid-element
                end=mid-1;

            } else if (target>array[mid]) {
                start=mid+1;

            }
            else{
                return mid;

            }
        }

        return -1; // when element is not found in array

    }
}