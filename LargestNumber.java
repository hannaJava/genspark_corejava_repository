import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        //Write a Java Program to Find Largest Among 3 Numbers without using if-else
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Java Program to Find Largest Among 3 Numbers without using if-else");
        int x,y,z,max;
        System.out.println("Please enter Three numbers : ");
        System.out.println(" enter the first number : ");
        x=input.nextInt();
        System.out.println(" enter the second number : ");
        y=input.nextInt();
        System.out.println(" enter the third number : ");
        z=input.nextInt();
        max=largestnumber(x,y,z);
        System.out.println("the lagest number is : "+max);


        //Write a Java Program to Create Singleton Class










        //Write a Java Program to Show Usage of Static keyword in Class
        //Write a Java Program to Show Usage of Access Modifier

        //Write a Java Program to Show Usage of Main() method
        //Write a Java Program to Show Use of Static and Non-static Methods




        //Write a Java Program to Sort a String
        //Write a Java Program to Swapping A Pair of Characters
        //Write a Java Program to Compare Paths of Two files
        //Write a Java Program to Read content from one file and writing it into another file
        //Write a Java Program to Handle the Unchecked Exceptions
    }

    static public int largestnumber(int x,int y,int z){
        int max=x;
        if(max<y) max=y;
        if(max<z) max=z;
       return max;
    }
}