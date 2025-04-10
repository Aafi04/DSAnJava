public class countingOccurences {
    public static void main(String[] args) {
        int num = 74727731; //4
        int ld;
        int count = 0;
        for (@SuppressWarnings("unused")
        int i = 0; num > 0; i++) {
            ld = num % 10;
            if (ld == 7) {
                count += 1;
            }
            num /= 10;
        }
        System.out.println("Occurences of 7: " + count);
    }
}
