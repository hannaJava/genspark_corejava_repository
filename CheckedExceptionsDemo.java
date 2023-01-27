import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsDemo {
    public static void main(String[] args) {
        //Write a Java Program to Handle the Checked exceptions
        try {
            readFile("location");
        } catch (FileNotFoundException e) {
            System.out.println(" error: file not found!");
        }
        finally {
            System.out.println("All done. We hope that worked!");
        }

    }

    public static void readFile(String location) throws FileNotFoundException {
        File file=new File(location);
        FileReader fileReader= new FileReader(file);
    }
}
