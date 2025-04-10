import java.util.Scanner;

public class evenorOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        if (num == 0 || num % 2 == 0) {
            System.out.println("Num is even.");
        }
        else {
            System.out.println("Num is odd.");
        }
    }
}
