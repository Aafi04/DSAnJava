import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principle: ");
        float principle = input.nextInt();
        System.out.println("Enter time: ");
        float time = input.nextInt();
        System.out.println("Enter rate: ");
        float rate = input.nextInt();
        input.close();
        float simpleInterest = (principle * time * rate) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
