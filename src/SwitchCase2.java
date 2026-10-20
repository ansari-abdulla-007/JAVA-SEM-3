import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hy");
                break;
            case 2:
                System.out.println("Hlw");
                break;
            case 3:
                System.out.println("How are you");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}