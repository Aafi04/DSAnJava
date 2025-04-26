public class knapsack {

    public static int knapsack(int[] weights, int[] values, int capacity, int n) {
        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (weights[n - 1] > capacity) {
            return knapsack(weights, values, capacity, n - 1);
        }
        
        return Math.max(values[n - 1] + knapsack(weights, values, capacity - weights[n - 1], n - 1),
                knapsack(weights, values, capacity, n - 1));
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3};
        int[] values = {6, 10, 12};
        int capacity = 5;
        int n = weights.length;

        System.out.println("Maximum value: " + knapsack(weights, values, capacity, n));
    }
}
