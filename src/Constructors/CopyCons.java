package Constructors;

public class CopyCons {
    public static void main(String[] args){
        Employee e1=new Employee("Abdulla",40000);

    }
}
class Employee{
    String name;
    int empId;
    Employee(String name,int empId){
        this.name=name;
        this.empId=empId;
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+empId);
    }
}