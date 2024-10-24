package Recursion;

public class PowerOfNumber {

    // find the power of any no.
    // p^q    2^3=8;

    static int PoN1(int p,int q){

    // Note time complexity of this method is O(q)
    // but we can improve it by O(log q)



        if(q==0){
            return 1;
        }

        return PoN1(p,q-1)*p;

    }
    static int PoN2(int p,int q){


        if(q==0){
            return 1;
        }
    int smallAns=PoN2(p,q/2);
        if(q%2==0){
            // even
            return smallAns*smallAns;

        }

        // odd
        return smallAns*smallAns*p;


    }
    public static void main(String[] args) {

        // System.out.println(PoN1(5,3));
        System.out.println(PoN2(5,3));

    }


}
