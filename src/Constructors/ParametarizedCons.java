package Constructors;

public class ParametarizedCons {
    public static void main(String[] args){
        Students s2=new Students("Abdulla",19);
    }
}
class Students{
    String name;
    int age;
    Students(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("My name is: "+name);
        System.out.println("My age is: "+age);
    }
}