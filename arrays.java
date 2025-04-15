import java.util.*;

public class arrays{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int al = input.nextInt();
        int[] arr = new int[al];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            arr[i] = input.nextInt();
        }
            System.out.print(Arrays.toString(arr));
            input.close();
    }
}