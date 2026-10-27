package Constructors;
// A constructor is a same name as a class.
// They do not have return type.
// We can call constructors only one time.

public class NonPara {
    public static void main(String[] args){
        Student s1=new Student();
    }
}
class Student{
   Student(){
       System.out.println("Constructor Called");
   }
}