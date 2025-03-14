import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p49_group_anagrams {

    // Function to group anagrams from the input array of strings
    public static List<List<String>> groupAnagrams(String[] strs) {

        // Handle edge case: if the input array is empty, return an empty list
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        // Map to store grouped anagrams, where the key is a unique representation of characters
        Map<String, List<String>> ansMap = new HashMap<>();

        // Array to count character frequencies for each string
        int[] charsCount = new int[26];

        // Iterate through each string in the input array
        for (String s : strs) {
            // Reset character count for the current string
            Arrays.fill(charsCount, 0);

            // Count the occurrences of each character in the string
            for (char c : s.toCharArray()) {
                charsCount[c - 'a']++;
            }

            // Build a unique key string based on character frequencies
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#"); // Separator to ensure unique key format
                sb.append(charsCount[i]);
            }

            String key = sb.toString(); // Final key for the current string

            // Add the string to the group of its anagram in the map
            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList<>());
            }
            ansMap.get(key).add(s);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(ansMap.values());
    }

    public static void main(String args[]) {
        // Input array of strings
        String[] strs = {"bat", "tab", "atb", "pan", "nap", "gun"};

        // Call the method to group anagrams
        List<List<String>> result = groupAnagrams(strs);

        // Print the grouped anagrams
        System.out.println(result);
    }
}
