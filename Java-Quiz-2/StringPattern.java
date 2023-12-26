public class StringPattern {
    public static void main(String[] args) {
        String input = "zohocorporationteam";
        printPattern(input);
    }
    private static void printPattern(String input) {
        int n = input.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // Print spaces before the character
            }
            System.out.print(input.charAt(i));
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("  ");
            }
            if (i != 0) {
                System.out.print("  ");
                System.out.print(input.charAt(i));
            }

            System.out.println(); // Move to the next line
        }
    }
}