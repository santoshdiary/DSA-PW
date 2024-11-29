package Recursion;

public class RecursionOnString {


    static String romoveA(String s,int idx){
        // base case
        if(idx>=s.length()){
            return " ";   // empty string
        }
        // recursive work
        String smallAns=romoveA(s,idx+1);
        char currChar=s.charAt(idx);
        // self work
        if(currChar!= 'a'){
            return currChar+smallAns;  // append smallAns in currentChar
        }
        return smallAns;
    }

    static String romoveA2(String s){

    // without using index value
    if(s.length()==0)return "";

    String smallAns=romoveA2(s.substring(1)); // substring method that return string from given index

    char currChar= s.charAt(0);
        if(currChar!= 'a'){
            return currChar+smallAns;  // append smallAns in currentChar
        }
        return smallAns;

    }

    static String reverse(String s,int idx) {
        if (idx == s.length()) return " ";

        String smallAns= reverse(s,idx+1);

        return smallAns+s.charAt(idx);  // appending currChar in smallAns



    }
    public static void main(String[] args) {
        String s="santosh";
       // System.out.println(romoveA(s,0));
        System.out.println(romoveA2(s));

        System.out.println(reverse(s,0));
    }
}
