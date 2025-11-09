import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class w13_3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file1.txt");
            int k = fr.read();
            FileWriter fw = new FileWriter("file2.txt");
            fw.write(k);
            fw.close();
            fr.close();
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
