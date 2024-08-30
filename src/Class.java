public class Class {
// class is user defined data type that contains number of variable or method . It is basically a template or blueprint
//which has no memory allocation but, when we create an object of that class that time memory allocated .
    public static void main(String[] args) {
    Student santosh=new Student("Santosh ",34,"Maths");
        System.out.println(santosh.stream);


    }


}

class Student {

    String name;
    int roll;
    String stream;
Student(String name,int roll,String sub){
    this.name=name;
    this.roll=roll;
    this.stream=sub;


}

}