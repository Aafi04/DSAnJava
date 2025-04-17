public class binarySearching{
    public static void main(String[] args) {
        int[] arr = {384, 357, 306, 257, 201, 198, 154, 20};
        int target = 357;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int starti = 0;
        int endi = arr.length - 1;
        int midi;


        if (arr[0] < arr[arr.length - 1]) {
            while (starti <= endi) {

                midi = (starti + endi) / 2;

                if (target < arr[midi]) {
                    endi = midi - 1;
                }

                else if (target > arr[midi]) {
                    starti = midi + 1;
                }

                else if (target == arr[midi]) {
                    System.out.println("Element found at: ");
                    return midi;
                }

                else {
                    System.out.println("Element not found");
                }

            }
            return -1;
        }

        else {
            while (starti <= endi) {

                midi = (starti + endi) / 2;

                if (target < arr[midi]) {
                    starti = midi + 1;
                }

                else if (target > arr[midi]) {
                    endi = midi - 1;
                }

                else if (target == arr[midi]) {
                    System.out.println("Element found at: ");
                    return midi;
                }

                else {
                    System.out.println("Element not found");
                }

            }
            return -1;
        }


    }
}
