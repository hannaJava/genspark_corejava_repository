import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        //Write a Java Program For Binary to Decimal Conversion
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Java Program For Binary to Decimal Conversion");
        System.out.println("please enter a binary number");
        String num = input.nextLine();//new String("10101001");
        if(binaryToDecimal(num)==0)System.out.println("the given entry is not a binary number");
        else System.out.println(binaryToDecimal(num));
    }
    static int binaryToDecimal(String n)
    {
        String num = n;
        int decValue = 0;
        int base = 1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '1') decValue += base;
                base = base * 2;
        }
        return decValue;
    }
}
