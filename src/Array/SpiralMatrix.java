package Array;

import java.util.Scanner;

public class SpiralMatrix {

    static void print2DArray(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void SpiralMatrix(int[][] matrix, int r, int c) {
        int topRow = 0;
        int bottomRow = r - 1;
        int rightCol = c - 1;
        int leftCol = 0;

        int totalElement = 0;

        while (totalElement < r * c) {

            // Printing top row elements
            for (int j = leftCol; j <= rightCol && totalElement < r * c; j++) {  // && is used to check in  every point loop break condtion
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            // Printing right column elements
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            // Printing bottom row elements
            for (int j = rightCol; j >= leftCol && totalElement < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            // Printing left column elements
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
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
        System.out.println("Spiral matrix:");
        SpiralMatrix(arr1,r1,c1);
    }
}
