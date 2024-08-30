package Method;

import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
        int [] val={ 4,2,4,54,23};
        // method calling

    change(val);

        System.out.println(Arrays.toString(val)); // Here Arrays is predefined class that contain various of operation in a array
    }
    // method declaration -
    public static void change(int [] array){
        array[0]=55;
    }
}
