package Array;

import java.util.Scanner;

public class sumOfRectangle {

    static void print2DArray(int [][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
static int sumOfRectangle2(int [][] matrix,int l1,int r1,int l2,int r2){
        // pre-calculating the horizontal sum for each row in the matrix -- like prefix sum
       //  if we ake q queries that time , it's helpful for us ;
       int sum=0;
       // finding prefix sum of each row of  given array;
   findPrefixSum(matrix);
    for(int i=l1;i<=l2;i++){    // rows traversal


        // r1 to r2 sum for row i
        if(r1>1){       // if col r1 is given 0 then  we will  get the error  ;
            sum+=matrix[i][r2]-matrix[i][r1-1];
        }
        else{
            sum+=matrix[i][r2];

        }
    }



    return sum;
}

static void findPrefixSum(int [][] array){

        // row and col wise prefix sum calculation


     int r=array.length;
     int c=array[0].length;
     // traverse horizontally to calculate ro-wise prefix sum

    for(int i=0;i<r;i++){
        for(int j=1;j<c;j++){

            array[i][j]+=array[i][j-1];
        }
    }
  //  col i.e.  vertically prefix sum

    for(int j=0;j<c;j++){ // fixing column
        for(int i=1;i<r;i++){
            array[i][j]+=array[i-1][j];

        }


    }


}

static int sumOfRectangle3(int [][] array,int l1,int r1,int l2,int r2){
        // prefix sum over column and rows both
    int ans=0, sum=0,  up=0,  left=0,  leftUp=0;
        findPrefixSum(array);

         sum=array[l2][r2];
         if(r1>=1) {
             left = array[l2][r1 - 1];
         }
         if(l1>=1) {
             up = array[l1 - 1][r2];
         }
         if(l1>=1 && r1>=1) {
             leftUp = array[l1 - 1][r1 - 1];
         }

        ans=sum-up-left+leftUp;

        return ans;
}
    static int sumOfRectangle(int [][] array,int r1,int c1,int r2,int c2){
        // it's not optimized way because if we aks sum  n times queries , then we need to traverse repeatedly .
        // that's why it's not optimized .


        int sum=0;

        // note that zero based indexing
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns  of  array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter the element of array:");
        int [][] arr1=new int [r][c];
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){

               arr1[i][j]=sc.nextInt();
           }
       }
        System.out.println("Array element:");
        print2DArray(arr1);
        System.out.println("Enter the two Co-ordinate for sum:   r1,c1,r2,c2");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();

       int sum= sumOfRectangle(arr1,r1,c1,r2,c2);
        System.out.println(sum);

//        int sum2=sumOfRectangle2(arr1,r1,c1,r2,c2);
//        System.out.println(sum);
        int sum3=sumOfRectangle3(arr1,r1,c1,r2,c2);
        System.out.println(sum3);

    }
}
