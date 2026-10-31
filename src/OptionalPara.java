public class OptionalPara {
    public static void main(String[] args){
        OptionalPara obj = new OptionalPara();
        obj.display("Abdulla");
        obj.display();
    }
    void display(String name){
        System.out.println("Name : "+ name);
    }
    void display(){
        display("Unknown");
    }
}
