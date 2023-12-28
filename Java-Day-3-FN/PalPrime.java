public class PalPrime {
    public PalPrime(int number, String message) {
        System.out.println("\nNumber " + number + " is " + message + "\n");
    }

    public static void main(String[] args) {
        int[] numbers = {1, 34543, 565, 727, 10099};

        for (int number : numbers) {
            checkPalPrime(number);
        }
    }

    private static void checkPalPrime(int number) {
        if (isPalindrome(number) && isPrime(number)) {
            new PalPrime(number, "PalPrime");
        } else if (isPalindrome(number)) {
            new PalPrime(number, "Palindrome");
        } else if (isPrime(number)) {
            new PalPrime(number, "Prime");
        } else {
            new PalPrime(number, "Neither Prime nor Palindrome");
        }
    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
