public class SequentialThread {
    public static void main(String[] args) {
        PrimeNumberThread primeThread = new PrimeNumberThread();
        PalindromeNumberThread palindromeThread = new PalindromeNumberThread();
        primeThread.start();
        try {
            primeThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        palindromeThread.start();
    }
}

class PrimeNumberThread extends Thread {
    @Override
    public void run() {
        System.out.println("Prime numbers from 0 to 10:");
        for (int i = 0; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeNumberThread extends Thread {
    @Override
    public void run() {
        System.out.println("\n\nPalindrome numbers from 10 to 50:");
        for (int i = 10; i <= 50; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}


