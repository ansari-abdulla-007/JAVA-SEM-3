public class MethodOverloading {
    public static void main(String[] args){
        Person p=new Person();
        p.run("Nirva");
        p.run(30,"Mansi");
    }
}
class Person{
    void run(String personRun){
        System.out.println(personRun+ " is running");
    }
    void run(int km,String PersonName){
        System.out.println(PersonName+" is running "+km+"kms");
    }
}