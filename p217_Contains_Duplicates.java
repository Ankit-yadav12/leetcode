import java.util.HashSet;

public class p217_Contains_Duplicates {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ints = new HashSet<>();
        for(int num : nums){
            if(ints.contains(num)) return true;
            ints.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7,8,9,0,1};
        boolean duplicatesFound= containsDuplicate(nums);
        System.out.println("Duplicates Found: "+ duplicatesFound);
    }
}
