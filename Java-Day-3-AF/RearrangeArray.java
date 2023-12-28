public class RearrangeArray {
    public static void rearrangeArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            while (left <= right && nums[left] < 0) {
                left++;
            }
            while (left <= right && nums[right] >= 0) {
                right--;
            }
            if (left <= right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] input = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("Original Array: " + arrayToString(input));
        rearrangeArray(input);
        System.out.println("After rearranging: " + arrayToString(input));
    }
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}