public class Multiple_Inherit {
    public static void main(String[] args){
        Child C=new Child();
        C.money();
        C.house();
    }
}
interface Father {
  public void money();
}
interface Mother{
  public void house();
}
class Child implements Father,Mother{
    @Override
    public void money(){
        System.out.println("Father gives money");
    }
    public void house(){
        System.out.println("Mother has a house");
    }
}