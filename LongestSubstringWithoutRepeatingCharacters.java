
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        int start = 0;
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

           if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }


            charIndexMap.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Length of longest substring without repeating characters in " + s1 + ": " + lengthOfLongestSubstring(s1));
        System.out.println("Length of longest substring without repeating characters in " + s2 + ": " + lengthOfLongestSubstring(s2));
        System.out.println("Length of longest substring without repeating characters in " + s3 + ": " + lengthOfLongestSubstring(s3));
    }
}
