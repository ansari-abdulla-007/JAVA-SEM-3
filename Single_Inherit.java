public class Single_Inherit {
    public static void main(){
        Child1 c1=new Child1();
        c1.behaviour();
        Parent1 p1=new Parent1();
        p1.behaviour();
    }
}
class Parent1{
    public void behaviour(){
        System.out.println("Hard working");
    }
}
class Child1 extends Parent1{
    public void behaviour(){
        System.out.println("Just chilling");
    }
}