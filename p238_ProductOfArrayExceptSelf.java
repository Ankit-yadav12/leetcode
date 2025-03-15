import java.util.Arrays;

class p238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // Initializing the result array and prefix product variable
        int[] result = new int[nums.length];
        int pre = 1;

        // Fill result array with default value of 1
        Arrays.fill(result, 1);

        // Calculating prefix product for each element
        for (int i = 0; i < nums.length; i++) {


                    result[i] = pre * result[i];
            pre = pre * nums[i];
        }

        // Initializing postfix product variable
        int post = 1;
        // Calculating postfix product for each element
        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] = result[j] * post;
            post = post * nums[j];
        }

        // Returning the result array
        return result;
    }

    public static void main(String[] args) {
        // Creating an instance of the p238_ProductOfArrayExceptSelf class
        p238_ProductOfArrayExceptSelf solution = new p238_ProductOfArrayExceptSelf();

        // Sample test case
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        System.out.println("Result array: " + Arrays.toString(result));
    }

}
