package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccrence {
    public static void main(String[] args) {
        int [] num={3,4,5,6,6,6,7,7,7,7,8,9,12};
        int target=7;
        int []a=searchRange(num,target);
        System.out.println(Arrays.toString(a));

    }
    static int [] searchRange(int [] array, int target){
        int [] ans={-1,-1}; // it will return as a default value when no any occurrence will be found of given no.

        ans[0]=search(array,target,true); // this is for first occurrence
        if(ans[0]!=-1){
            ans[1]=search(array,target,false);
            // this is not first occurrence i.e. last occurrence that's why false
        }


        return  ans;
    }
    static int search(int [] array,int target, boolean firstOccurece){
        int ans=-1;
        int start=0;
        int end=array.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>array[mid]){
                start=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else{

                ans=mid;
                if(firstOccurece){   // here will be decided that first or last occurrence by this  variable
                    end=mid-1;

                }
                else{
                    start=mid+1;

                }
            }

        }

        return ans;

    }

}
