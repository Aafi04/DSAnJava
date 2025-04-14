public class reverseNum {
    public static void main(String[] args) {
        int num = 74727731;
        int result = 0;
        int ld;
        for (@SuppressWarnings("unused")
        int i = 0; num > 0; i++) {
            ld = num % 10; //ld becomes 1
            num /= 10; //becomes 7472773
            result = result * 10 + ld; //result becomes 0*10 + 1
        }
        System.out.println(result);
    }
}