package Array;

import java.util.Scanner;

public class RotateArray90 {


    static void print2DArray(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    static int[][] transpose(int [][] array, int r,int c){
        int [][] ans=new int[c][r];

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                ans[j][i]=array[i][j];

            }
        }
        return ans;

    }


    static int  [][]  Rotate90(int [][] array,int r,int c){

       int [][] ans= transpose(array,r,c);
       for(int i=0;i< ans.length;i++){
           reverse(ans[i]);
       }



        return ans;

    }

    static int [] reverse(int [] array){
        int start=0;
        int end=array.length-1;

        while(start<end){

            int tem=array[start];
            array[start]=array[end];
            array[end]=tem;
            start++;
            end--;

        }

        return array;

    }
    public static void main(String[] args) {

        // Rotate an array 9o degree
        // break down - if we get the transpose of matrix and then reverse every row then we will get the desired ans


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns  of  array");
        int r1=sc.nextInt();
        int c1=sc.nextInt();


        System.out.println("Enter the element of array:");
        int [][] arr1=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println(" arrays :");
        print2DArray(arr1);

        System.out.println("Rotate array:");


       int [][] ans= Rotate90(arr1,r1,c1);
       print2DArray(ans);

    }
}
