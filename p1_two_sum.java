import java.util.HashMap;

public class p1_two_sum {
    public  static int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[]){
        int[] nums = {2,3,4,5,7};
        int[] result = twoSum(nums,9);

        for ( int i = 0; i<result.length;i++){
            System.out.println((i+1)+" element is: "+ result[i]);
        }
    }

}
