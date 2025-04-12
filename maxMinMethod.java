import java.util.Scanner;

public class maxMinMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("Enter num3: ");
        int num3 = input.nextInt();
        input.close();
        int max = maxNum(num1, num2, num3);
        System.out.println(max);
        int min = minNum(num1, num2, num3);
        System.out.println(min);
    }

    static int maxNum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }

        else if (b > a && b > c) {
            return b;
        }

        else {
            return c;
        }

    }

    static int minNum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }

        else if (b < a && b < c) {
            return b;
        }

        else {
            return c;
        }

    }
}
