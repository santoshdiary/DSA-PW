package Recursion;

public class GCD {

    static int GreatestCommonFactor(int a,int b){
        // brute Force approach,

        int leastNO;
       int hcf=1;
        if(a<b){
            leastNO=a;
        }
        else {
            leastNO=b;
        }
        for(int i=leastNO;i>0;i--){
            if(a%i==0 && b%i==0){
                hcf=i;
               return hcf;
            }
        }
        return hcf;
    }

    static int gcdByDivision(int x,int y){
        // bachpan wala method

        while(x % y!=0){
            int remain=x%y;
            x=y;
            y=remain;
        }
        return y;
    }
    static int gcdByRecursion(int x, int y){
        //Euclid Algorithm

        // base case
        if(y==0){
            return x;
        }

      return   gcdByRecursion( y,x%y);

    }
    public static void main(String[] args) {
        // method 1
        System.out.println(GreatestCommonFactor(120,140));
        // method 2
        System.out.println(gcdByDivision(14,16));
        // by recursion
        System.out.println(gcdByRecursion(24,15));

    }
}
