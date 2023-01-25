import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        //Write a Java Program to Print Spiral Pattern of Numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Java Program to Print Spiral Pattern of Numbers");
        System.out.println("please enter a number : ");
        int n = input.nextInt();
        int[][] twoDarr = new int[n][n];
        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = n - 1;
        int k=1;
        while (k<=n * n)
        {
            //to right loop
            for (int i = startCol; i <= endCol; i++) {
                twoDarr[startRow][i]=k++;
            }
            startRow++;
            //down loop
            for (int i = startRow; i <= endRow; i++)  {
                twoDarr[i][endCol]=k++;
                 }
            endCol--;
            //to left loop
            for (int i = endCol; i >= startCol; i--){
                twoDarr[endRow][i]=k++;
            }
            endRow--;
            //up loop
            for (int i = endRow; i >= startRow; i--) {
                twoDarr[i][startCol]=k++;
            }
            startCol++;
         }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    System.out.printf("%4d",twoDarr[i][j]);
                 }
            System.out.println();
            }
        }
}
