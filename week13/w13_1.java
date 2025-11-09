import java.io.IOException;
import java.io.FileWriter;

public class w13_1 {
   public static void main(String[] args) {
      try {
         FileWriter fw = new FileWriter("file1.txt");
         fw.close();
      } catch (IOException e) {
         System.out.println("File does not exist");
      }
   }
}
