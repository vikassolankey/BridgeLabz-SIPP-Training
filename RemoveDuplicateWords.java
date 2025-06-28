public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String input = "This This is a test test string with duplicate duplicate words";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (result.indexOf(word + " ") == -1) { 
                result.append(word).append(" ");
            }
        }

        System.out.println("Original: " + input);
        System.out.println("after removing duplicates: " + result.toString().trim());
    }
}
