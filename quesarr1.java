public class quesarr1 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 24, 51, 7};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxnum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxnum) {
                maxnum = arr[i];
            }
        }
        return maxnum;

    }
}
