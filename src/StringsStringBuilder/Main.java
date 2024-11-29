package StringsStringBuilder;

public class Main {
    public static void main(String[] args) {
    String name="santosh Kumar";
    int length =name.length(); 
    char a=name.charAt(1);
    String b=name.replace('s','S');
    System.out.println(b);

    String str="Hello";
    String str2="Hello";
    String str3=new String ("Hello");
        System.out.println(str==str2);
        System.out.println(str==str3); // showing false because "==" operator comparing address of both strings
        System.out.println(str.compareTo(str3)); // comparing exactly two strings

        // there are so many function have, to do operation on string
    }
}
