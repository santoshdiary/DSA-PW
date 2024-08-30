package Method;

public class Overloading {

    public static void main(String[] args) {

        int ans=sum(3,4);
        System.out.println(ans);

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,  int c ){

        return a+b+c;
    }

}
