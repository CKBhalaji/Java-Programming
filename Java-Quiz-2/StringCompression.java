public class StringCompression {
    public static void main(String[] args) {
        String input = "AABBCCCDE";
        String compressedString = compressString(input);
        System.out.println("Input: " + input);
        System.out.println("\nOutput: " + compressedString);
    }
    private static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        return compressed.toString();
    }
}