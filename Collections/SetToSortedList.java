import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> sortedList = new ArrayList<>(hashSet);
        Collections.sort(sortedList);
        System.out.println(sortedList); 
    }
}