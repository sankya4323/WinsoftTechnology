import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacters {
    public static String findNonRepeatingCharacters(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder nonRepeatingChars = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                nonRepeatingChars.append(c);
            }
        }

        return nonRepeatingChars.toString();
    }

    public static void main(String[] args) {

        String input = "abacbcdedfg";
        String result = findNonRepeatingCharacters(input);
        System.out.println("Non-repeating characters in \"" + input + "\": " + result);
    }
}