import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveTo
public class TextContainer {
    String str = "Hello";

    @Saver
   public void save(String path){
       try (PrintWriter a = new PrintWriter(path)) {

               a.println(str);

           System.out.println("Save: " + str);

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
