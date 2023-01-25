import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        //Write a Java Program to Check whether input character is vowel or consonant
        System.out.println("Write a Java Program to Check whether input character is vowel or consonant.");
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Please enter a character : ");
        ch=input.nextLine().toLowerCase().charAt(0);
        if(isVowel(ch)) System.out.println(ch+" is a vowel");
        else  System.out.println(ch+" is a consonant");
    }

    static public boolean isVowel(char ch)
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u') return true;
        return false;
    }
}
