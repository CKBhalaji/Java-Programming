public class PermutationsNestedLoops {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3};
        permute(nums);
    }
    private static void permute(int[] nums) {
        int n = nums.length;
        boolean[] used = new boolean[n];
        int[] currentPermutation = new int[n];

        backtrack(nums, used, currentPermutation, 0);
    }
    private static void backtrack(int[] nums, boolean[] used, int[] currentPermutation, int currentIndex) {
        if (currentIndex == nums.length) {
            for (int value : currentPermutation) {
                System.out.print(value + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                currentPermutation[currentIndex] = nums[i];
                backtrack(nums, used, currentPermutation, currentIndex + 1);
                used[i] = false;
            }
        }
    }
}
