public class SubsequenceSum {
    
    public static int sumOfSubsequenceProducts(int[] arr) {
        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                result += arr[i] * arr[j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 1, 2, 3};

        int output1 = sumOfSubsequenceProducts(arr1);
        int output2 = sumOfSubsequenceProducts(arr2);

        System.out.println("Sample 1 Output: " + output1); // Expected output: 19
        System.out.println("Sample 2 Output: " + output2); // Expected output: 49
    }
}
