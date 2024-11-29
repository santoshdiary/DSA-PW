package StringsStringBuilder;

public class toggleCharInString {
    // the question is change the toggle of character of given string
    // means if character in lower then ,change it upper case and vice-versa
    // SanToSH---> sANtOsh ;
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("SaTosH kuMar");


         for(int i=0;i<str.length();i++){

             boolean flag=true; // true -- capital
             char ch=str.charAt(i);

             if(ch ==' '){
                 continue;
             }

             int asci=(int)ch; // changing char into ascii value so , that we can compare capital and small letter
             if(asci>=97) flag = false; // that means current letter is small
             if(flag==true) {
                 asci+=32;  // note the differences bw lower and upper case is 32 ;
                 char dn=(char)asci;  // now changing asci to char
                str.setCharAt(i,dn);
             }
             else{
                 asci-=32;
                 char dn=(char)asci;
                 str.setCharAt(i,dn);
             }
         }
        System.out.println(str);
    }
}
