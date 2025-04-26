import java.util.Arrays;

public class assignment {
    public static int solveAssignmentProblem(int[][] costMatrix) {
        int n = costMatrix.length;
        int[] u = new int[n];
        int[] v = new int[n];
        int[] p = new int[n];
        int[] way = new int[n];

        for (int i = 1; i < n; i++) {
            p[0] = i;
            int[] minv = new int[n];
            Arrays.fill(minv, Integer.MAX_VALUE);
            boolean[] used = new boolean[n];
            int j0 = 0;

            do {
                used[j0] = true;
                int i0 = p[j0], delta = Integer.MAX_VALUE, j1 = 0;
                for (int j = 1; j < n; j++) {
                    if (!used[j]) {
                        int cur = costMatrix[i0 - 1][j - 1] - u[i0] - v[j];
                        if (cur < minv[j]) {
                            minv[j] = cur;
                            way[j] = j0;
                        }
                        if (minv[j] < delta) {
                            delta = minv[j];
                            j1 = j;
                        }
                    }
                }
                for (int j = 0; j < n; j++) {
                    if (used[j]) {
                        u[p[j]] += delta;
                        v[j] -= delta;
                    } else {
                        minv[j] -= delta;
                    }
                }
                j0 = j1;
            } while (p[j0] != 0);

            do {
                int j1 = way[j0];
                p[j0] = p[j1];
                j0 = j1;
            } while (j0 != 0);
        }

        return -v[0]; // Minimum cost
    }

    public static void main(String[] args) {
        int[][] costMatrix = {{9, 2, 7, 8}, {6, 4, 3, 7}, {5, 8, 1, 8}, {7, 6, 9, 4}};

        int result = solveAssignmentProblem(costMatrix);
        System.out.println("Minimum cost: " + result);
    }
}
