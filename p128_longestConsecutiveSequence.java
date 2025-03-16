import java.util.HashSet;

public class p128_longestConsecutiveSequence{
    // Method to find the longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int longest = 0;

        for (int num : numbers) {
            // Check if 'num' is the start of a sequence
            if (!numbers.contains(num - 1)) {
                int current = num;
                int length = 1;

                // Count the length of the consecutive sequence
                while (numbers.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Sample test case
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("The longest consecutive sequence length is: " + result);

        // Another test case
        int[] nums2 = {9, 1, 3, 2, 10, 4, 20};
        System.out.println("The longest consecutive sequence length is: " + longestConsecutive(nums2));
    }
}
