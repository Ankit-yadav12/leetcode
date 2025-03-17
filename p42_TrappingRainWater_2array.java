public class p42_TrappingRainWater_2array {
    // Method to calculate trapped water
    public static int trap(int[] arr) {
        int n = arr.length;
        int l_bound[] = new int[n], r_bound[] = new int[n], max = 0;

        // Calculate the left bounds
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            l_bound[i] = max;
        }

        max = 0; // Reset max for the right bounds
        // Calculate the right bounds
        for (int j = n - 1; j >= 0; j--) {
            if (arr[j] > max) {
                max = arr[j];
            }
            r_bound[j] = max;
        }

        int sum = 0; // Total trapped water
        // Calculate the trapped water
        for (int k = 0; k < n; k++) {
            sum += Math.min(l_bound[k], r_bound[k]) - arr[k];
        }
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Sample test cases
        int[] test1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] test2 = {4, 2, 0, 3, 2, 5};
        int[] test3 = {1, 0, 2, 0, 1};
        int[] test4 = {5, 4, 3, 2, 1}; // Edge case: Descending heights, no water

        // Running test cases
        System.out.println("Water trapped for test1: " + trap(test1)); // Output: 6
        System.out.println("Water trapped for test2: " + trap(test2)); // Output: 9
        System.out.println("Water trapped for test3: " + trap(test3)); // Output: 1
        System.out.println("Water trapped for test4: " + trap(test4)); // Output: 0
    }
}
