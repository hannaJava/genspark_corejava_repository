import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args) {
        //Write a Java Program For Binary Search
        //recursive
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a number : ");
        int[] array={1,4,4,2,5,-3,6,2};
        int value=input.nextInt();
        int i=binarySearch(array,0,array.length-1,value);
        if(i!=-1)System.out.println("the index of "+value+" is : "+i);
        else System.out.println("not found");
    }

    public static int binarySearch(int[] values,int i0,int i1, int valueToFind){
        if(i0>i1)return -1;
        int iMid=(i0+i1)/2;
        if(values[iMid]==valueToFind) return iMid;
        if(values[iMid]>valueToFind) return binarySearch(values, i0,iMid-1,valueToFind);
        return binarySearch(values,iMid+1,i1,valueToFind);
    }
}
