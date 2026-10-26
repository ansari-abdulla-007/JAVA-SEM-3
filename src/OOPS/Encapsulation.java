package OOPS;

public class Encapsulation {
   public static void main(String[] args) {
       Programmer p = new Programmer();
       p.setName("Abdulla");
       p.getName();

   }
}
class Programmer{
    private String name;

    //getter method used to get the data.
    public String getName() {
        return name;
    }
    //setter method is used to set or modify the data.
    public void setName(String name) {
        this.name=name;
        System.out.println("My name is "+this.name);
    }
}