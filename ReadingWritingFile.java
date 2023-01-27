import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingWritingFile {
    public static void main(String args[]) throws IOException {
        //Write a Java Program to Read content from one file and writing it into another file
        FileReader in = null;
        FileWriter out = null;
        String input="D:\\GenSpark\\Java_Programs.txt";
        String output="D:\\GenSpark\\sampleOutput.txt";
        try {
            in = new FileReader(input);
            out = new FileWriter(output);
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Reading and Writing in a file is done!!!");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();     	}
        }
    }

}
