public class p167_twoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            }
            if (sum < target) {
                left++;
            }
            if (sum > target) {
                right--;
            }
        }
        return new int[] {left + 1, right + 1}; // 1-based indexing
    }

    public static void main(String[] args) {
        // Test case 1
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: 1, 2

        // Test case 2
        int[] numbers2 = {1, 3, 5, 7};
        target = 8;
        result = twoSum(numbers2, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: 2, 3
    }
}
