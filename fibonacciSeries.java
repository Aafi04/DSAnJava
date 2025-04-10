public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;
        int element = 0;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            sum += a;
            element = a + b;
            a = b;
            b = element;
        }
        System.out.println(sum);
    }
}
