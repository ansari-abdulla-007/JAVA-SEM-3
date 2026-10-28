package OOPS.Inheritance;

public class UsingInterface {
    public static void main(String[] args){
        UPI u=new UPI();
        u.pay();
        Card c=new Card();
        c.pay();
    }
}
interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment using UPI");
    }
}
class Card implements Payment{
    public void pay(){
        System.out.println("Payment using Card");
    }
}