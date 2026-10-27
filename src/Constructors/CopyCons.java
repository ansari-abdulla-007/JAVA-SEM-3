package Constructors;

public class CopyCons {
    public static void main(String[] args){
        Employee e1=new Employee("Ansari",40000);
        Employee e=new Employee(e1);
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
    Employee(Employee e){
        this.name=e.name;
        this.empId=e.empId;
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + empId);
    }
}