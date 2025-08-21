import java.util.*;

public class FrequencyCounterhashmap {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 3, 5, 1, 3, 9, 5};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        System.out.println("Element Frequencies:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + "  " + frequencyMap.get(key));
        }
    }
}
