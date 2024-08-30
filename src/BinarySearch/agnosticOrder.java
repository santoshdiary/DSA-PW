package BinarySearch;

public class agnosticOrder {


    // how to identify that array sorted in ascending or descending order?

    public static void main(String[] args) {

        int [] arr={4,5,8,56,78,98,100,102,105};
        int []arr1={100,98,98,95,80,70,66,28,0,-1};
        int a=orderAgnosticBS(28,arr1);

        System.out.println("Element founded in index "+a);

    }

    static int orderAgnosticBS(int target, int[] array) {
        int start = 0;
        int end = array.length - 1;
        boolean IsAscending = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == array[mid]) {

                return mid;
            }
            if (IsAscending) {

                if (target < array[mid]) {

                    end = mid - 1;

                } else if (target > array[mid]) {
                    start = mid + 1;

                }

            } else {

                if (target > array[mid]) {

                    end = mid - 1;

                } else if (target < array[mid]) {
                    start = mid + 1;

                }


            }


        }
       return -1;
    }
}
