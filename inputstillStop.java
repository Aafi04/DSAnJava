import java.util.Scanner;

public class inputstillStop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value;
        float sum = 0;

        while (true) {
            value = input.next();
            if (value.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int num = Integer.parseInt(value);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number or 'x' to stop.");
            }
        }

        input.close();
        System.out.println("Program terminated due to x");
        System.out.println("Resulting sum: " + sum);
    }
}
