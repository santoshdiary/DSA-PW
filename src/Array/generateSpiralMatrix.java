package Array;

import java.util.Scanner;

public class generateSpiralMatrix {


    static void print2DArray(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    static int [][] genrateSpiralMatrixSpiralMatrix(int n) {
       int [][] ans=new int[n][n];


        int topRow = 0;
        int bottomRow = n - 1;
        int rightCol = n - 1;
        int leftCol = 0;

        int totalElement = 0;
        int count=1;

        while (totalElement < n * n) {

            // Printing top row elements
            for (int j = leftCol; j <= rightCol && totalElement < n * n; j++) {  // && is used to check in  every point loop break condtion
                ans[topRow][j]=count;
                count++;
                totalElement++;
            }
            topRow++;

            // Printing right column elements
            for (int i = topRow; i <= bottomRow && totalElement < n * n; i++) {
                ans[i][rightCol]=count;
                count++;
                totalElement++;
            }
            rightCol--;

            // Printing bottom row elements
            for (int j = rightCol; j >= leftCol && totalElement < n * n; j--) {
                ans[bottomRow][j]=count;
                count++;
                totalElement++;
            }
            bottomRow--;

            // Printing left column elements
            for (int i = bottomRow; i >= topRow && totalElement < n * n; i--) {
                ans[i][leftCol]=count;
                count++;
                totalElement++;
            }
            leftCol++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n of Square matrix:");
        int n=sc.nextInt();

      int[][]ans= genrateSpiralMatrixSpiralMatrix(n);
      print2DArray(ans);


    }
}


