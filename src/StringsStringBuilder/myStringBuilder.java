package StringsStringBuilder;

public class myStringBuilder {
  // string builder is upgrade version of string class that provides easy manipulation on string because string in java is immutable

    public static void main(String[] args) {
        // declaration
        StringBuilder str=new StringBuilder("hello");
        System.out.println(str);
        System.out.println(str.charAt(1));
        str.setCharAt(2,'r');
        System.out.println(str);
        str.insert(0,'M')   ;
        System.out.println(str);
        str.delete( 0,2);
        System.out.println(str); 
        str.append(" santosh");
        System.out.println(str);
        System.out.println(str.length());
        

    }
}
