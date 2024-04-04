import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWithRank {
    public static int[] replaceWithRank(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedArr.length; i++) {
            rankMap.put(sortedArr[i], i + 1);
        }


        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArr = {10, 8, 15, 12, 6, 20, 1};
        int[] outputArr = replaceWithRank(inputArr);
        System.out.println(Arrays.toString(outputArr));    }
}