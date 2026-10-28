package OOPS.Inheritance;

public class MultiLevel {
    public static void main(String[] args){
        Result r1=new Result();
        r1.showPerson();
        r1.showStudent();
        r1.showResult();
    }
}
class Person{
    void showPerson(){
        System.out.println("I am a Person");
    }
}
class Student extends Person{
    void showStudent(){
        System.out.println("I am a Student");
    }
}
class Result extends Student{
    void showResult(){
        System.out.println("Student Result");
    }
}