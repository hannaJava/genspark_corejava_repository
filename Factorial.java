import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Write a Java Program to Find Factorial of a number
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Java Program to Find Factorial of a number");
        System.out.println("Please enter a number : ");
        int n;
        n=input.nextInt();
        System.out.println("the factorial of : "+n+" is : "+factorialOfNumber(n));
    }

    public static int factorialOfNumber(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
