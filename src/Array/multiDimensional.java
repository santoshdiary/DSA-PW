package Array;

public class multiDimensional {

    public static void main(String[] args) {
        int [][] max= { {3,4,5,},  // the size of column is not mandatory bc. col can be anything
                        {4,5,6,2},
                        {3,5,8,9} };

        for(int row=0;row<max.length;row ++){
            for(int col=0;col<max[row].length;col++){

                System.out.print(max[row][col]+" ");
            }
            System.out.println();
        }


    }
}
