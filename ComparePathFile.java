import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ComparePathFile {
    public static void main(String args[]) throws IOException {
        //Write a Java Program to Compare Paths of Two files
        String path1="D:\\GenSpark\\Java_Programs.txt";
        String path2="D:\\GenSpark\\sampleOutput.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        if(file1.compareTo(file2)==0) System.out.println("the two files have the same path");
        else System.out.println("the two files haven't the same path");
    }
}
