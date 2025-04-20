public class naiveStringMatch {

    public static void naiveStringMatch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Searching for pattern in text...\n");

        boolean found = false;

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;

            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == patternLength) {
                System.out.println("Pattern found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found in the text.");
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        naiveStringMatch(text, pattern);
    }
}
