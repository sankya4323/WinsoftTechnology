import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}