package Array;

public class findRepeating {
    // find the first repeating element in array
    public static void main(String[] args) {
        int [] arr={4,6,3,5,8,2,3,};
        int ans=findRepeatingElement(arr);
        System.out.println(ans);

    }
    static int findRepeatingElement(int [] array){
       for(int i=0;i<array.length;i++){
           for(int j=i+1;j<array.length;j++){
               if(array[i]==array[j]){
                   return i;
               }
           }
       }

        return -1;
    }
}
