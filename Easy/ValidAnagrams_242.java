import java.util.Arrays;

public class ValidAnagrams_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        isAnagrams(s, t);
    }

    static void isAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("Not anagrams");
            return;
        }

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println("Not anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
    }
}
