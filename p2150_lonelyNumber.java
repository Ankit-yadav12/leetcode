import java.util.*;

public class p2150_lonelyNumber {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums.length == 1) {
                    list.add(nums[i]);
                    return list;
                }
                if (nums[i] != nums[i + 1] && nums[i] + 1 != nums[i + 1]) {
                    list.add(nums[i]);
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1] && nums[i] - 1 != nums[i - 1]) {
                    list.add(nums[i]);
                }
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1] &&
                    nums[i] - 1 != nums[i - 1] && nums[i] + 1 != nums[i + 1]) {
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        p2150_lonelyNumber solution = new p2150_lonelyNumber();
        int[] nums = {10, 6, 5, 8};  // Sample input
        List<Integer> lonelyNumbers = solution.findLonely(nums);
        System.out.println("Lonely numbers: " + lonelyNumbers);
    }
}
