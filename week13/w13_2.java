import java.io.FileWriter;
import java.io.IOException;

public class w13_2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file1.txt");
            fw.write('a');
            fw.close();
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
    }
}
