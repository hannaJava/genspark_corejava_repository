import java.util.Scanner;

public class RemoveAllOccurences {
    public static void main(String[] args) {
        //Write a Java Program to Remove All Occurrences of an Element in an Array
        int[] array={1,2,5,8,3,9,7,6,2,5,2};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element to be removed : ");
        int elt = input.nextInt();
        int newSize=removeOccurences(array,elt);
        for(int i=0;i<newSize;i++){
            System.out.print(array[i]);
        }
    }

    public static int removeOccurences(int[] array, int eltToRemove){
        int newSize=0;
        if(array.length==0) return 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=eltToRemove){
                array[newSize]=array[i];
                newSize++;
            }
            else array[i]=0;
        }
        return newSize;
    }
}
