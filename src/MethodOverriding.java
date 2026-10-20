public class MethodOverriding {
    static void main(String[] args){

    }
}
class parent{
    public void walk(){
        System.out.println("Father is walking");
    }
    public void speak(){
        System.out.println("Father is speaking");
    }
}
class child extends parent{
    public void walk(){
        System.out.println("This child is walking in zig zag style");
    }
    public void speak(){
        System.out.println("This child is speaking in our own voice");
    }
}