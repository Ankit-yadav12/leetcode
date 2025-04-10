import java.util.Arrays;

public class p189_RotateArray {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensures k doesn't exceed array length

        reverse(nums, 0, n - 1); // Reverse entire array
        reverse(nums, 0, k - 1); // Reverse first k elements
        reverse(nums, k, n - 1); // Reverse remaining elements
    }

    public static void main(String[] args) {
        // Test case: Rotate {1, 2, 3, 4, 5, 6, 7} by k = 3
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
