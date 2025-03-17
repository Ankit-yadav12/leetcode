public class p11_MaxAreaCalculator {
    // Method to calculate the maximum area
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;
        while (i < j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Sample test cases
        int[] test1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] test2 = {1, 1};
        int[] test3 = {4, 3, 2, 1, 4};
        int[] test4 = {1, 2, 1};

        // Running test cases
        System.out.println("Maximum area for test1: " + maxArea(test1)); // Output: 49
        System.out.println("Maximum area for test2: " + maxArea(test2)); // Output: 1
        System.out.println("Maximum area for test3: " + maxArea(test3)); // Output: 16
        System.out.println("Maximum area for test4: " + maxArea(test4)); // Output: 2
    }
}
