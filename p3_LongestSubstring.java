import java.util.HashSet;

public class p3_LongestSubstring {
    // Method to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) return s.length();

        int left = 0, right = 0, length = 0;
        HashSet<Character> traversed = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);

            // If character is already in the set, move the left pointer and adjust the set
            while (traversed.contains(c)) {
                traversed.remove(s.charAt(left));
                left++;
            }

            // Add the new character to the set and update the length
            traversed.add(c);
            length = Math.max(length, right - left + 1);
            right++;
        }

        return length;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("Test case 1: " + lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println("Test case 2: " + lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println("Test case 3: " + lengthOfLongestSubstring("pwwkew"));   // Output: 3
        System.out.println("Test case 4: " + lengthOfLongestSubstring(""));         // Output: 0
        System.out.println("Test case 5: " + lengthOfLongestSubstring("abcdef"));   // Output: 6
    }
}
