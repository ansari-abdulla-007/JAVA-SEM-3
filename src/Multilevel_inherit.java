public class Multilevel_inherit {
    public static void main(String[] args){
        AbduChild a=new AbduChild();
        a.human();
        a.abduu();
        a.abduchild();
    }
}
class Human{
    void human(){
        System.out.println("Im a human being");
    }
}
class Abduu extends Human{
    void abduu(){
        System.out.println("My name is Abdulla");
    }
}
class AbduChild extends Abduu{
    void abduchild(){
        System.out.println("Abdu's child");
    }
}