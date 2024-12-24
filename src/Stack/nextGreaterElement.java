package Stack;

import java.util.Arrays;
import java.util.Stack;


public class nextGreaterElement {

    public static int[] findNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return nge;
    }
    public static void main(String[] args) {
        // iterative method

        int [] arr={2,4,5,2,6,5,12,9,1};
        int[] res=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            res[i]=-1;
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[j]>arr[i]){
//                    res[i]=arr[j];
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(res));
        int [] q= findNextGreaterElement(arr);
        System.out.println(Arrays.toString(q));
    }


}
