import java.util.*;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        
        boolean result = isArmstrong(n);
        System.out.println(result);
    }

    static int isPower(int n) {
        int count = 0;
        for (int i = 0; n > 0; i++) {
            n /= 10;
            count += 1;
        }

        return count;
    }

    static boolean isArmstrong(int n) {
        int answer = n;
        int ld;
        int arms = 0;
        int b = isPower(n);

        for (int i = 0; n > 0; i++) {
            ld = (int) Math.pow((n%10), b);
            arms += ld;
            n /= 10;
        }
        return arms == answer;
    }
}