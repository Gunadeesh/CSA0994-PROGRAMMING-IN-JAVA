import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        // Calculate sum of all elements
        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }

        // Find the minimum and maximum sums
        long maxSum = totalSum - findMinValue(arr);
        long minSum = totalSum - findMaxValue(arr);

        // Output
        System.out.println(minSum + " " + maxSum);

        scanner.close();
    }

    // Helper method to find the minimum value in an array
    private static long findMinValue(long[] arr) {
        long minValue = Long.MAX_VALUE;
        for (long num : arr) {
            minValue = Math.min(minValue, num);
        }
        return minValue;
    }

    // Helper method to find the maximum value in an array
    private static long findMaxValue(long[] arr) {
        long maxValue = Long.MIN_VALUE;
        for (long num : arr) {
            maxValue = Math.max(maxValue, num);
        }
        return maxValue;
    }
}
