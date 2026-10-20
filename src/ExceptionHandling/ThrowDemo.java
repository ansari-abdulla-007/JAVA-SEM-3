package ExceptionHandling;
import java.util.*;

public class ThrowDemo {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new IllegalArgumentException("Age must be 18");
        }
        System.out.println("Allowed");
    }
}
