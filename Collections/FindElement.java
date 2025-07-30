import java.util.LinkedList;
import java.util.ListIterator;

public class FindElement {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0) throw new IllegalArgumentException("N must be positive");
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();

        int count = 0;
        while (count < n && first.hasNext()) {
            first.next();
            count++;
        }
        if (count < n) throw new IllegalArgumentException("N is larger than list size");

        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        String result = findNthFromEnd(list, N);
        System.out.println(result); // Output: D
    }
}