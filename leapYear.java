import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap");
            }
            else {
                System.out.println("Not leap");
            }
        }
        else {
            System.out.println("Not leap");
        }
    }
}
