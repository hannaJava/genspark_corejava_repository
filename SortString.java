import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        //Write a Java Program to Sort a String
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to sort : ");
        String unsorted = input.nextLine();
        String sorted=stringSorting(unsorted);
        System.out.println(sorted);
    }

    public static String stringSorting(String unsorted){
        String sorted="";
        unsorted.toLowerCase();
        char[] chArr=unsorted.toCharArray();
        char temp;
        for(int i=0;i<chArr.length;i++) {
            for (int j = 0; j < chArr.length; j++) {
                if (chArr[i] < chArr[j]) {
                    temp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp;
                }
            }
        }
        for(int i=0;i<chArr.length;i++){
            sorted+=chArr[i];
        }
        return sorted;
    }
}
