package SortingAlgorithms;
import java.util.Arrays;
public class RadixSort
{
    public static void main(String[] args) {
        int [] arr={ 112,111,20,110};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void radixSort(int [] arr){
        int max=findMax(arr);
        // apply counting sort to sort elements base on place value
        for(int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }


    }
    static int findMax(int [] arr){
        int max=Integer.MIN_VALUE;   // min. value of integer
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }

        return max;
    }
    static void countSort(int [] arr,int place){      // modified count sort
                                                        // place value = (x/place)%10
        int n=arr.length;
        int [] output=new int[n];


        int [] countArr= new int [10];  // frequency arr
        for(int i=0;i< arr.length;i++){
            countArr[(arr[i]/place)%10]++;
        }
        // finding the prefix sum that help to find last correct idx of corresponding element
        for(int i=1;i<countArr.length;i++){
            countArr[i]+=countArr[i-1];
        }

        //putting input array element with  corresponding index
        for(int i=n-1;i>=0;i--){
            int idx=countArr[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            countArr[(arr[i]/place)%10]--;
        }
        // copy all element of output to arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }


    }
}
