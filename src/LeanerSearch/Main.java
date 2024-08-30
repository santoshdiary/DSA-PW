package LeanerSearch;

public class Main {

    public static void main(String[] args) {
        int [] marks={3, 4, 24, 53, 54, 4};

        boolean search=isExits(marks,26);
        System.out.println(search); 

        int ans=linearSearch(marks,43);
        System.out.println(ans);
    }

    public static boolean isExits(int [] array, int target){
        for(int i=0;i<array.length;i++){

            if(array[i]==target){

                return true;

            }

        }
        return false;
    }

    static int linearSearch (int []array ,int target){

        if(array.length==0){

            return -1;
        }
        for(int element:array){

            if(element==target){

                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
