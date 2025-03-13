public class p242_valid_anagram{

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] frequency = new int[26];

        for(int i = 0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }

        for(int i = 0;i<t.length();i++){
            if(frequency[t.charAt(i)-'a']<1) return false;
            frequency[t.charAt(i)-'a']--;
        }

        return true;
    }

    public static void main(String args[]){
        String s1 = "Ankit";
        String s2 = "Ankur";

        boolean Anagram = isAnagram(s1.toLowerCase(),s2.toLowerCase());
        System.out.println("isAnagram: "+ Anagram);

        Anagram = isAnagram(s1.toLowerCase(),s1.toLowerCase());
        System.out.println("isAnagram: "+ Anagram);
    }
}
