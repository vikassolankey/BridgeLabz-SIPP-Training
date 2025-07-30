import java.util.*;

public class FindFrequency {
    public static Map<String, Integer> findFrequency(List<String> items) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> result = findFrequency(input);
        System.out.println(result); 
    }
}
