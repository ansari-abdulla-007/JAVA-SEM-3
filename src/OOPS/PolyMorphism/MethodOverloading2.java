package OOPS.PolyMorphism;

public class MethodOverloading2 {
    public static void main(String[] args){
        MethodOverloading2 m2=new MethodOverloading2();
        m2.add(10,20);
        m2.add(10,20,30);
        m2.add(5.5,4.5);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
}