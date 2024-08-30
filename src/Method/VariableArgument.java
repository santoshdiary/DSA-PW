package Method;

import java.util.Arrays;

public class VariableArgument{
    // A method that take multiple argument is called varArg method .

    public static void main(String[] args) {

        demo(3,4,32,4);
        demo("santosh","gotam","rakesh ");
    }

    public static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    public static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
}
