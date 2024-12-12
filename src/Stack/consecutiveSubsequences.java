package Stack;

import java.util.Arrays;
import java.util.Stack;

public class consecutiveSubsequences {

    public static int [] remove(int []arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        // Process elements
        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (i == n - 1 || arr[i] != arr[i + 1]) {
                st.pop();
            }
        }

        // Prepare result array
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,10,10,10,4,4,5,7,7,2};
        int [] res=remove(arr);
        System.out.println(Arrays.toString(res));
    }
}
