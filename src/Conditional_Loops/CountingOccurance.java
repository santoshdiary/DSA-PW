package Conditional_Loops;
import java.util.Scanner;
public class CountingOccurance {
    public static void main(String[] args) {

        int num=43433387;
        int count=0;
        int countfor=7;

        while(num>0){

            int remDig= num%10;
            num/=10;
            if(remDig==countfor){
                count++;
            }


        }
        System.out.println(count);

    }
}
