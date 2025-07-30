import java.util.*;

public class RotateElements {
    public static <T> List<T> rotateList(List<T> list, int positions) {
        int size = list.size();
        if (size == 0 || positions % size == 0) {
            return new ArrayList<>(list);
        }
        positions = positions % size;
        List<T> rotated = new ArrayList<>(size);
        rotated.addAll(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        List<Integer> output = rotateList(input, rotateBy);
        System.out.println(output); 
    }
}