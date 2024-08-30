package Method;

public class Swap {

    public static void main(String[] args) {
        int a=13;
        int b=3;
        swap(a,b);

        System.out.println(a+" "+b);

    }

    public static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;


    }
}
