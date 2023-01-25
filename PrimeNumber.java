import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Write a Java Program to Display All Prime Numbers from 1 to N
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Java Program to Display All Prime Numbers from 1 to N");
        System.out.println("Please enter a number : ");
        int n;
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
    }
    static boolean isPrime(int n){
        if(n==0||n==1)return false;
        for(int i=2; i<n; i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
