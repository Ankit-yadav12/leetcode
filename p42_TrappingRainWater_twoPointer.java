public class p42_TrappingRainWater_twoPointer {
    // Method to calculate the trapped water
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int total = 0;
        int leftMax = 0, rightMax = 0;

        // Two-pointer approach to calculate trapped water
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                total += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                total += rightMax - height[right];
                right--;
            }
        }
        return total;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Sample test cases
        int[] test1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] test2 = {4, 2, 0, 3, 2, 5};
        int[] test3 = {1, 0, 2, 0, 1};
        int[] test4 = {5, 4, 3, 2, 1}; // Edge case: No trapped water

        // Running and printing test cases
        System.out.println("Trapped water for test1: " + trap(test1)); // Output: 6
        System.out.println("Trapped water for test2: " + trap(test2)); // Output: 9
        System.out.println("Trapped water for test3: " + trap(test3)); // Output: 1
        System.out.println("Trapped water for test4: " + trap(test4)); // Output: 0
    }
}
