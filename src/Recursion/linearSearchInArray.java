package Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class linearSearchInArray {
   static boolean Search(int [] arr,int target,int idx ){
       //base case
       if(idx>= arr.length){
            return false ;
        }
       // self work
      if (arr[idx]==target){
          return true;
      }
      // recursive work
       return (Search(arr,target,idx+1));



    }
    static int  findFirstIdx(int [] arr,int target,int idx ){
        //base case
        if(idx>= arr.length){
            return -1 ;
        }
        // self work
        if (arr[idx]==target){
            return idx;
        }
        // recursive work
        return (findFirstIdx(arr,target,idx+1));



    }
   static void findAllIdx(int [] arr,int target,int idx){
       // base case
       if(idx>=arr.length){
           return;
       }
       // self work
       if(arr[idx]==target){
           System.out.println(idx);
           // don't return here, bc we have to print all indices on that target is present
       }

       //recursive work
       findAllIdx(arr,target,idx+1);
   }
    static ArrayList<Integer> findAllIndex(int [] arr, int target, int idx){
        // base case
        if(idx>=arr.length){
           return new ArrayList<Integer>();  // empty arraylist
        }

       ArrayList<Integer> ans=new ArrayList<>();  // ans  arraylist for returning

        // self work
        if(arr[idx]==target){
         ans.add(idx); // add method 
        }

        //recursive work
      ArrayList<Integer> smallAns=  findAllIndex(arr,target,idx+1);
        ans.addAll(smallAns); // addAll method of arraylist
        return ans;

    }
     static int findLastIdx(int [] arr,int idx,int target){

       //tough , learn by dry run
         if (idx >= arr.length) {
             return -1;
         }
         int lastIdx=findLastIdx(arr,idx+1,target);

         if(lastIdx==-1){
             if (target == arr[idx]) {
                 return idx;
             }
             else{
                 return -1;
             }
         }
         else{
             return lastIdx;
         }


     }

   public  static void main(String[]args){
        int [] rollNo={23,43,22,44,342,34,232 ,34 ,34 };
        int target=34;
       System.out.println(Search(rollNo,target,0));
       System.out.println("element found in index");
       System.out.println(findFirstIdx(rollNo,target ,0));
       System.out.println("all indices");
       findAllIdx(rollNo,target ,0);

       ArrayList<Integer> ans=new ArrayList<>();
       ans=findAllIndex(rollNo,target ,0);
       System.out.println("Indices in arraylist "+ ans);
       int [] arr={2,4,4,3,2};
       int target1=4;
       System.out.println("last index of  target "+findLastIdx(arr,0,target1));


    }
}
