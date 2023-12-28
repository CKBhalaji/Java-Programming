import java.util.Arrays;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int uniqueCount = 1; // At least one unique element (the first one)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
    public static void main(String[] args) {
        int[] input = {22, 22, 77, 77, 88, 89, 89};
        System.out.println("Original Array: " + Arrays.toString(input));
        int uniqueCount = removeDuplicates(input);
        System.out.println("After removing duplicates: " + Arrays.toString(Arrays.copyOfRange(input, 0, uniqueCount)));
        System.out.println("No. of unique elements: " + uniqueCount);
    }
}