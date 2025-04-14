import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> charCount = new HashSet<Character>();
        for(char ch : jewels.toCharArray()){
            charCount.add(ch);
        }
        int jewelCount = 0;
        for(char ch : stones.toCharArray()){
            if(charCount.contains(ch)){
                jewelCount++;
            }
        }
        return jewelCount;
    }
}

public class p771_JewelsAndStones {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = solution.numJewelsInStones(jewels, stones);

        // Expected output: 3
        System.out.println("Number of jewels in stones: " + result);
    }
}
