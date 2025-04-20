import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Input: Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Input: Enter the element to search: ");
        int target = scanner.nextInt();

        int result = linearSearch(array, target);

        if (result == -1) {
            System.out.println("Output: Element " + target + " not found in the array.");
        } else {
            System.out.println("Output: Element " + target + " found at index " + result + ".");
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
