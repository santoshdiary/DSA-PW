package LeanerSearch;

import java.util.Arrays;

public class SeachInString {


    public static void main(String[] args) {
     String name="Santosh";
     char target ='m';


//        for(int i=0;i<name.length();i++){
//            char temp=name.charAt(i);
//
//            System.out.print(temp+" ");
//
//        }

        System.out.println(Arrays.toString(name.toCharArray()));

        // Arrays.toString is spl fun. that convert an  array into a String while toCharArray converter string into char
    boolean ans= isExist(name,target);
        System.out.println(ans);



    }

    public static boolean isExist(String str,char target){
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);

            if(temp==target){
                return true;
            }


        }

        return false;
    }
}
