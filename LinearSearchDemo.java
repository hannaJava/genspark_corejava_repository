import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        //Write a Java Program For Linear Search
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a number : ");
        int[] array={1,4,4,2,5,-3,6,2};
        int value=input.nextInt();
        int i=linearSearch(array,value);
        if(i!=-1)System.out.println("the index of "+value+" is : "+i);
        else System.out.println("not found");
    }
    public static int linearSearch(int[] values,int valueToFind){
        for(int i=0;i<values.length;i++){
            if(values[i]==valueToFind) return i;
        }
        return -1;
    }
}
