package Array;

import java.util.Scanner;

public class pascalTriangle {

    // Pascal triangle is a special triangle  whose corner element is 1 ans result element is sum of corresponding upper element
/*

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1



* */
    static void print2DArray(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int [][] pascal(int n){
        int [][] ans=new int [n][];
        for(int i=0;i< n;i++){
            // ith row has i+1 col
            ans[i]=new int[i+1];

            // 1st and last element of every row is 1;

            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){

                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }

        }

        return  ans;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of row of pascal triangle:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       int [][]ans= pascal(n);
        System.out.println("Pascal Triangle:");
        print2DArray(ans);


    }




}
