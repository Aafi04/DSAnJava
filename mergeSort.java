import java.util.*;

public class mergeSort {

    void merge(int a[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        mergeRecursive(a, L, R, l, 0, 0);
    }

    void mergeRecursive(int a[], int L[], int R[], int k, int i, int j) {
        if (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                mergeRecursive(a, L, R, k + 1, i + 1, j);
            } else {
                a[k] = R[j];
                mergeRecursive(a, L, R, k + 1, i, j + 1);
            }
        } else if (i < L.length) {
            a[k] = L[i];
            mergeRecursive(a, L, R, k + 1, i + 1, j);
        } else if (j < R.length) {
            a[k] = R[j];
            mergeRecursive(a, L, R, k + 1, i, j + 1);
        }
    }

    void sort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(a, l, m);
            sort(a, m + 1, r);

            merge(a, l, m, r);
        }
    }

    public static void main(String args[]) {
        int a[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array:");
        System.out.println(Arrays.toString(a));

        mergeSort ob = new mergeSort();
        ob.sort(a, 0, a.length - 1);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(a));
    }
}
