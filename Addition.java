import java.util.*;
public class Addition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first num:");
        int a=sc.nextInt();
        System.out.println("Enter a second num:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Here is your sum:");
        System.out.println(sum);
    }
}