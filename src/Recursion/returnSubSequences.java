package Recursion;

import java.util.ArrayList;

public class returnSubSequences {

    // given a string , return all subsequences in arraylist
    // sub-sequences means  all possible combination of string without changing  order
    // "abc"  ---->   abc,  a__, _b_ ,__c ,  ab_, _bc, a_c, ___

    static ArrayList<String> getSSQ(String s ){

        ArrayList<String> ans=new ArrayList<>();
        // base case
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }

        char curr=s.charAt(0);
        ArrayList<String> smallAns= getSSQ(s.substring(1));
        // smallAns=["bc","b", "c" , " "]
        //ans=  [ "bc", "abc", "b", "ab", "c", "ac", "", a ]

        for(String ss:smallAns){
            ans.add(ss);  // eg.  "bc"
            ans.add(curr+ss); // prefixing "current char" in small work // curr-- 'a'  then  "abc"
        }
        return ans;
    }
    static void printSSQ(String s,String currAns){


        // In starting currAns will be an empty string      " "
        // base case
        if(s.length()==0){
            System.out.println(currAns);
            return ;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);

        // recursive work + self work
        printSSQ(remString,currAns+curr); // add curr
        printSSQ(remString,currAns);// do not add curr

    }


    public static void main(String[] args) {
        String s="abc";
       // System.out.println("sub-sequences: "+getSSQ(s));
        printSSQ(s," ");

    }

}
