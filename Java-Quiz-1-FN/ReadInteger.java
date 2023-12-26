import java.util.Scanner;
public class ReadInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int enteredInteger = scanner.nextInt();
        System.out.println("You entered: " + enteredInteger);
        scanner.close();
    }
}
