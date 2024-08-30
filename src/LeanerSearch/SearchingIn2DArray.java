package LeanerSearch;

public class SearchingIn2DArray {

    public static void main(String[] args) {
        int [][] arr={
                { 3,4,45, 45},
                {34,890,34,353,53},
                {63,54,33,52}
        };

        boolean ans=Search(arr,52);
        System.out.println(ans);

    }

    public static boolean Search(int[][] arr, int target ){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){

                if(target==arr[row][col]){

                    System.out.println(row+" "+col);
                    return true;
                }
            }

        }

        return false;
    }

    }

