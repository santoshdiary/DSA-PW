package SortingAlgorithms.Problems;

import java.util.Arrays;

public class arrangeStringInLexicogharphical {

    public static void main(String[] args) {
        String [] s={"apple","papaya","mango","man","orange","grapes","app"};
        lexicographical(s);
        System.out.println(Arrays.toString(s));
    }
    static void lexicographical(String[] str ){
        for(int i=0;i< str.length;i++){
            int lastIdx=str.length-1-i;
            int minIdx=i;
            for(int j=0;j<=lastIdx;j++){
                if(str[j].compareTo(str[minIdx])<0 ){  // compareTo() method return a integer value ,
                    // if returned value is less than 0 that means 1st term is less than 2nd
                    minIdx=j;
                }
            }
            // swap
            String temp=str[minIdx];
            str[minIdx]=str[lastIdx];
            str[lastIdx]=temp;
        }
    }
}
