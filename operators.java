import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num: ");
        float num1 = input.nextFloat();
        System.out.println("Enter second num: ");
        float num2 = input.nextFloat();
        System.out.println("Enter operator (+, -, *, /): ");
        String operator = input.next();
        input.close();

        if (operator.contains("+")) {
            System.out.println(num1+num2);
        }
        else if (operator.contains("-")) {
            System.out.println(num1-num2);
        }
        else if (operator.contains("*")) {
            System.out.println(num1*num2);
        }
        else if (operator.contains("/")) {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println("Invalid operator input.");
        }
    }
}
