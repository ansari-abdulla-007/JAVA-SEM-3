import java.util.Arrays;
public class ArraysBasics {
    public static void main(String[] args){
        int age = 20;
        int physics = 78;
        int chem = 76;
        int eng = 79;

        int[] marks = new int[3]; //use new keyword when we don't know values.
        marks[0] = 78;
        marks[1] = 76;
        marks[2] = 79;
        System.out.println(marks[0]);

        //Length;
        System.out.println(marks.length);
        // sort; //sorting in ascending order.
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}