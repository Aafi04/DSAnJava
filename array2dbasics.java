import java.util.*;

public class array2dbasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr2d = new int[3][3];
        System.out.println("Enter 2d array elements: ");

        //Taking array input
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }
        }


/*         //Printing array output
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        } */

        for (int row = 0; row < arr2d.length; row++) {
            System.out.print(Arrays.toString(arr2d[row]));
        }

/* 
        for (int[] a : arr2d) {
            System.out.println();
        } */

        in.close();
    }
}