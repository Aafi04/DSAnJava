class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int ld;
        int temp = 0;
        for (@SuppressWarnings("unused")
        int i = 0; x > 0; i++) {
            ld = x % 10;
            temp = (temp * 10) + ld;
            x /= 10;
        }
        return original == temp;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(121);
        System.out.println(result);
    }
}
