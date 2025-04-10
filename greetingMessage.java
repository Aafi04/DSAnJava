import java.util.Scanner;

public class greetingMessage {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();
        System.out.println("Hello! " + name);
    }
}
