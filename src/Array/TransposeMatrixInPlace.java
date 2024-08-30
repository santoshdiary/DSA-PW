package Array;

import java.util.Scanner;

public class TransposeMatrixInPlace {

    static void print2DArray(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }


    static int [][] TransposeInplace(int [][] array,int r){



        for(int i=0;i< array.length;i++){
            for(int j=i+1;j<array.length;j++){  // for escape from repetition of swapping, we start col loop from i+1;
                int temp;
                temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }

        return  array;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns  of  array");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        if(r1!=c1){
            System.out.println("Transpose only possible square matrix in place method");
            return;
        }
        System.out.println("Enter the element of array:");
        int [][] arr1=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println(" arrays :");
        print2DArray(arr1);

        System.out.println("Transpose of matrix");
        int [][] ans=TransposeInplace(arr1,r1);
        print2DArray(ans);
    }

}
