package OOPS.Inheritance;

public class SingleLevel {
    public static void main(String[] args){
        Triangle t = new Triangle();
        t.area();
        t.area(10,6);
    }
}
class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}