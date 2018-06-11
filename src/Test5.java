import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        try {
            String s = "ABCDE";
            byte b[] = s.getBytes();
            FileOutputStream file = new FileOutputStream("test.txt", true);
            file.write(b);
            file.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
