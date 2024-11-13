package BinarySearch;

public class FirstOccurrence {

    public static void main(String[] args) {
        int[] arr = {1, 1, 11, 11,  19, 20, 22, 22, 30};
        int a = binarySearch(arr, 20);
        System.out.println(a);
    }

    static int binarySearch(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;
        int FO = -1; // first occurrence

        while (st <= en) {
            int mid = st + (en - st) / 2; // Calculate mid inside the loop

            if (arr[mid] == target) {
                FO = mid;
                en = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }
        return FO;
    }
}
