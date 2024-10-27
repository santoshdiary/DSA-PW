package Recursion;

public class checkPalindromeString {

    static boolean isPalindrome(String s,int left, int right){
        // base case
        if(left>=right){
            return true;
        }

        // self and recursive work
        return ( (s.charAt(left)==s.charAt(right) && isPalindrome(s,left+1,right-1) )) ;


    }
    public static void main(String[] args) {
        String s="level";
        String s1="santos";
        System.out.println(isPalindrome(s1,0,s.length()-1));
    }

}
