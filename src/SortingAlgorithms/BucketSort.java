package SortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import  java.util.ArrayList;

public class BucketSort {


    static void bucketSort(float[] arr){
        int n=arr.length;
        //buckets
       ArrayList<Float> [] buckets=new ArrayList[n];
       // create empty buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        //add elements into our buckets
        for(int i=0;i<n;i++){
            int bucketIndex=(int)arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        // sort each bucket individually

        for (int i=0;i<buckets.length;i++){
           Collections.sort(buckets[i]);
        }

        // merge all buckets to get final array
        int index=0;
        for(int i=0;i<buckets.length;i++){
        ArrayList<Float> currBucket=buckets[i];
        for(int j=0;j<currBucket.size();j++){
            arr[index++]=currBucket.get(j);
        }

        }
    }
    public static void main(String[] args) {
        float[] arr={0.5f , 0.4f, 0.3f,0.1f};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
