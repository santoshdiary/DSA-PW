package OOPS;

public class Classes {

    // In a simple way class is a custom data type, or blue-print of real world entity
    // eg. car is class and maruti800, tataHariar ,etc  is object

    
    public static class Student {
        String name;
        int rollNo;
        double percentage;
    }
    public static void main(String[] args) {
        Student santosh =new Student();
        Student ram=new Student();
        santosh.name="santosh kushwaha";
        santosh.percentage=89.22;
    }
}
