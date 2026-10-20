package ExceptionHandling;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("notes.txt");
        fr.close();
    }
}