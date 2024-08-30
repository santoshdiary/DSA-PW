package LeanerSearch;
// Q. how many element in an array contain even of digit .
public class EvenDigitCount {
    public static void main(String[] args) {

        int []arr={5,3,341,649,34,53899,341};
        int ans=findNumber(arr);
        System.out.println(ans);
    }
    public static int findNumber(int []arry){
        int count=0;
        for(int element:arry){
            if(even(element)){
                count++;
            }
        }

        return count;
    }
    public static boolean even(int num){

        // edge case
        if(num<0){
            num*=-1;
        }

        int countDigit=0;
      while(num>0){
          int digit= num%10;
          num/=10;
          countDigit++;
      }
      return (countDigit%2==0);

    }

}
