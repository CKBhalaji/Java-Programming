import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        String filePath = "C:\Users\bhala\OneDrive\Documents\Java-Day-5-AF\number.txt";

        try {
            checkForPositiveNumbers(filePath);
        } catch (PositiveNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void checkForPositiveNumbers(String filePath) throws IOException, PositiveNumberException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.print("Content of " + filePath + ": ");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line + " ");
                String[] numbers = line.split("\\s+");
                for (String number : numbers) {
                    int num = Integer.parseInt(number);
                    if (num > 0) {
                        throw new PositiveNumberException("Positive number found: " + num);
                    }
                }
            }
        }
    }

    static class PositiveNumberException extends Exception {
        public PositiveNumberException(String message) {
            super(message);
        }
    }
}
