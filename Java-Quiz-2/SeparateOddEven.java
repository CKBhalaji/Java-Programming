public class SeparateOddEven {
    public static void main(String[] args) {
        int[] originalArray = {10,3,5,12,17,22};
        int[] oddArray = getOddElements(originalArray);
        int[] evenArray = getEvenElements(originalArray);
        System.out.println("Original Array: ");
        printArray(originalArray);

        System.out.println("\nOdd Elements: ");
        printArray(oddArray);

        System.out.println("\nEven Elements: ");
        printArray(evenArray);
    }
    private static int[] getOddElements(int[] array) {
        int countOdd = 0;
        for (int value : array) {
            if (value % 2 != 0) {
                countOdd++;
            }
        }
        int[] oddArray = new int[countOdd];
        int index = 0;
        for (int value : array) {
            if (value % 2 != 0) {
                oddArray[index++] = value;
            }
        }
        return oddArray;
    }
    private static int[] getEvenElements(int[] array) {
        int countEven = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                countEven++;
            }
        }
        int[] evenArray = new int[countEven];
        int index = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                evenArray[index++] = value;
            }
        }
        return evenArray;
    }
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}