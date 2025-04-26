public class kmp {

    public static void buildLPS(String pattern, int[] lps, int i, int len) {
        if (i == pattern.length()) {
            return;
        }

        if (pattern.charAt(i) == pattern.charAt(len)) {
            lps[i] = len + 1;
            buildLPS(pattern, lps, i + 1, len + 1);
        } else {
            if (len != 0) {
                buildLPS(pattern, lps, i, lps[len - 1]);
            } else {
                lps[i] = 0;
                buildLPS(pattern, lps, i + 1, len);
            }
        }
    }

    public static boolean kmpSearch(String text, String pattern, int[] lps, int i, int j) {
        if (j == pattern.length()) {
            return true;
        }
        if (i == text.length()) {
            return false;
        }

        if (text.charAt(i) == pattern.charAt(j)) {
            return kmpSearch(text, pattern, lps, i + 1, j + 1);
        } else {
            if (j != 0) {
                return kmpSearch(text, pattern, lps, i, lps[j - 1]);
            } else {
                return kmpSearch(text, pattern, lps, i + 1, j);
            }
        }
    }

    public static boolean search(String text, String pattern) {
        if (pattern.isEmpty()) {
            return true;
        }
        if (text.isEmpty()) {
            return false;
        }

        int[] lps = new int[pattern.length()];
        buildLPS(pattern, lps, 1, 0);

        return kmpSearch(text, pattern, lps, 0, 0);
    }

    public static void main(String[] args) {
        String text = "abxabcabcaby";
        String pattern = "abcaby";

        if (search(text, pattern)) {
            System.out.println("Pattern found in the text.");
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}
