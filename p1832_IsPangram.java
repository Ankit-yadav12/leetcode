import java.util.HashSet;

public class p1832_IsPangram {
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> pangram = new HashSet<>();

        // If sentence length is less than 26, it's impossible to be a pangram
        if (sentence.length() < 26)
            return false;

        for (char ch : sentence.toCharArray())
            pangram.add(ch);

        return (pangram.size() == 26);
    }

    public static void main(String[] args) {
        String testSentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Is Pangram? " + checkIfPangram(testSentence));
    }
}
