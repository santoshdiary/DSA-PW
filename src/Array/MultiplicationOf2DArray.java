package Array;

import java.util.Scanner;

public class MultiplicationOf2DArray {

    static void print2DArray(int [][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){  // Corrected inner loop condition
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplyArray(int [][] arr1, int r1, int c1, int [][] arr2, int r2, int c2 ){
        if(c1 != r2){
            System.out.println("Multiplication is not possible");
            return;
        }

        int [][] ans = new int [r1][c2];
        for(int i = 0; i < r1; i++){  // Pointing the row of matrix
            for(int j = 0; j < c2; j++){  // Pointing the column of the matrix
                for(int k = 0; k < c1; k++){   // To perform addition of row of 1st array and column in 2nd array
                    ans[i][j] += arr1[i][k] * arr2[k][j];   // Perform multiplication and addition
                }
            }
        }

        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){  // Corrected inner loop condition
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the 1st array:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter the elements of the 1st array:");
        int [][] arr1 = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of the 2nd array:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Enter the elements of the 2nd array:");
        int [][] arr2 = new int[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st array:");
        print2DArray(arr1);
        System.out.println("2nd array:");
        print2DArray(arr2);

        System.out.println("Multiplied Matrix:");
        multiplyArray(arr1, r1, c1, arr2, r2, c2);

        sc.close();  // Closing the Scanner to avoid resource leaks
    }
}
