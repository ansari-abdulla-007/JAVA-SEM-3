package OOPS.PolyMorphism;
// Method overloading is a feature in java in which multiple methods have the same name but different parameter lists within the same class.
public class MethodOverloading {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
    }
}
class Student{
    String name="Abdulla";
    int age=19;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}