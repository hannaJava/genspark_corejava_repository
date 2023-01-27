import java.util.Scanner;

public class Add2Binary {
    public static void main(String[] args) {
        //Write a  Java Program to add two binary numbers.
        String binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        binary1 = input.nextLine();
        System.out.print("Enter second binary number: ");
        binary2 = input.nextLine();
        System.out.println(addBinary(binary1,binary2));
    }

    public static String addBinary(String binary1,String binary2){
        StringBuilder result=new StringBuilder();
        int i=binary1.length()-1;
        int j=binary2.length()-1;
        int carry=0;
        while(i>=0||j>=0){
            int sum=carry;
            if(i>=0)sum+=binary1.charAt(i)-'0';//convert character to number
            if(j>=0)sum+=binary2.charAt(j)-'0';
            result.append(sum%2);
            carry=sum/2;
            i--;
            j--;
            //System.out.println(carry);
        }

        if(carry!=0) result.append(carry);
         return result.reverse().toString();
    }
}
