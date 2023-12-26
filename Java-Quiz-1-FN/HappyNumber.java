import java.util.HashSet;
import java.util.Set;
public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        boolean result = isHappy(n);
        System.out.println(result);
    }
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}