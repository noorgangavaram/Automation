import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {
    public static void findfile() throws FileNotFoundException {
        File file = new File("Sample.txt");
        FileInputStream stream = new FileInputStream(file);
    }
    public static void main(String args[]){
        try {
            findfile();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
