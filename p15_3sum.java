import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p15_3sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            // Skip duplicates for the first number
            if (i == 0 || nums[i] != nums[i - 1]) {
                findTwoSum(nums, i, result);
            }
        }
        return result;
    }

    private static void findTwoSum(int[] nums, int i, List<List<Integer>> result) {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                // Add the triplet to the result list
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;

                // Skip duplicates for 'left' and 'right'
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Triplets: " + threeSum(nums1));
        // Output: [[-1, -1, 2], [-1, 0, 1]]

        // Test case 2
        int[] nums2 = {0, 0, 0, 0};
        System.out.println("Triplets: " + threeSum(nums2));
        // Output: [[0, 0, 0]]

        // Test case 3
        int[] nums3 = {-2, 0, 1, 1, 2};
        System.out.println("Triplets: " + threeSum(nums3));
        // Output: [[-2, 0, 2], [-2, 1, 1]]
    }
}
