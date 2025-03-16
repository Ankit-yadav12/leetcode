public class p125_validPalindrome {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Sample test cases
        String test1 = "A man, a plan, a canal: Panama";
        System.out.println("Is \"" + test1 + "\" a palindrome? " + isPalindrome(test1));

        String test2 = "race a car";
        System.out.println("Is \"" + test2 + "\" a palindrome? " + isPalindrome(test2));

        String test3 = " ";
        System.out.println("Is \"" + test3 + "\" a palindrome? " + isPalindrome(test3));
    }
}
