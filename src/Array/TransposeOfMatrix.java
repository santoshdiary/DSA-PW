package Array;

import java.util.Scanner;

public class TransposeOfMatrix {


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

    public static void main(String[] args) {
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
      int [][] ans= transpose(arr1,r1,c1);
        System.out.println("Transpose of given max :");
        print2DArray(ans);
    }
}
