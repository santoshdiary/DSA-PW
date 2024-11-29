package BinarySearch;

public class searchIn2DArr {
    public static void main(String[] args) {
        int [][] arr={ {1,2,5,7},
                       {8,9,10,11},
                       {12,13,14,15}
        };
        System.out.println(search2D(arr,15));
        System.out.println(search2D_(arr,15));
    }

    static boolean search2D(int [][] arr,int target ){
        // number of rows=n,number of cols=m
        int n=arr.length, m=arr[0].length;
        int st=0; int end=n*m-1;
        while(st<=end){

            int mid= st+(end-st)/2;
            int midEle=arr[mid/m][mid%m];
            if(midEle==target){
                return true;
            }
            else if(midEle>target){
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return false;
    }

    static boolean search2D_(int [][] arr,int target ){
        int n=arr.length;
        int m=arr[0].length;
        // we start search from last row ,first col;
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            if(arr[i][j]==target){
                return true;
            }
            if(target<arr[i][j]){
                j--; // move left side
            }
            else{
                i++; // move down
            }
        }
        return false;
    }
}
