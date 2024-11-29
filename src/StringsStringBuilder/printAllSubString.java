package StringsStringBuilder;

public class printAllSubString {
    public static void main(String[] args) {
        String str="abc";

        for(int i=0;i<str.length();i++){
            for(int  j=1+i;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" "); // note string index is included and end index is excluded
            }
        }
    }
}
