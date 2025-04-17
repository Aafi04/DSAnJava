public class binarySearching{
    public static void main(String[] args) {
        int[] arr = {124, 157, 176, 198, 207, 209, 384};
        int target = 157;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int starti = 0;
        int endi = arr.length - 1;
        int midi = (starti + endi) / 2;

        while (starti <= endi) {

            if (target < arr[midi]) {
                endi = midi - 1;
                midi = (starti + endi) / 2;
            }
            
            else if (target > arr[midi]) {
                starti = midi + 1;
                midi = (starti + endi) / 2;
            }

            else if (target == arr[midi]) {
                System.out.println("Element found at: " + midi);
            }

            else {
                System.out.println("Element not found");
            }

        }
        return -1;
    }
}