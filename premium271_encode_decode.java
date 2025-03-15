import java.util.*;

public class premium271_encode_decode {

    final static char DELIMITER = '#';

    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length());
            sb.append(DELIMITER);
            sb.append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String> res = new LinkedList<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            // Find the number of characters
            StringBuilder sb = new StringBuilder();
            while (arr[i] != DELIMITER) {
                sb.append(arr[i++]);
            }
            i++;

            // Retrieve the string and add it to the result list
            int numOfChars = Integer.valueOf(sb.toString());
            int end = i + numOfChars;
            sb = new StringBuilder();
            while (i < end) {
                sb.append(arr[i++]);
            }
            i--;
            res.add(sb.toString());
        }
        return res;
    }


    public static void main(String[] args) {
        // Example list of strings to encode
        List<String> originalList = Arrays.asList("hello", "world", "encode-decode", "test");

        // Encode the list of strings
        String encodedString = encode(originalList);
        System.out.println("Encoded String: " + encodedString);

        // Decode the string back to the original list
        List<String> decodedList = decode(encodedString);
        System.out.println("Decoded List: " + decodedList);

        // Verify the result
        System.out.println("Is decoding accurate? " + originalList.equals(decodedList));
    }
}
