package Array;

import java.util.Scanner;

public class AdditionOfTwoMatrix {


    static void print2DArray(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void sumOFArray(int [][] arr1,int r1 ,int c1,int[][]arr2,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Sum is not possible");
            return ;
        }
        int [][] ans=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){

                ans[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns  of 1st array");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the element of 1st array:");
        int [][] arr1=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }


        System.out.println("Enter the numbers of rows and columns  of 2st array");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int [][] arr2=new int[r2][c2];
        System.out.println("Enter the element of 2st array:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("1st arrays :");
        print2DArray(arr1);
        System.out.println("2nd arrays: ");
        print2DArray(arr2);

        System.out.println("sum of given array is :");
        sumOFArray(arr1,r1,c1,arr2,r2,c2);

    }
}
