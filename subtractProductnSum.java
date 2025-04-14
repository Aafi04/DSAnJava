public class subtractProductnSum {
    public static void main(String[] args) {
        int num = 1345;
        int product = 1;
        int sum = 0;
        int ld = 0;
        for (@SuppressWarnings("unused")
        int i = 0; num > 0; i++) {
            ld = num % 10;
            num /= 10;
            product *= ld;
            sum += ld;
        }
        System.out.println("Product of digits: " + product);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Subtraction of " + product + " and " + sum + " is: " + (product-sum));
    }
}