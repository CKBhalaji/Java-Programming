import java.util.*;
public class PartitionAndMerge {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int partitionSize = 2;
        int[] partitionOrder = {3, 2, 1};

        int[] result = partitionAndMerge(array, partitionSize, partitionOrder);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    private static int[] partitionAndMerge(int[] array, int partitionSize, int[] partitionOrder) {
        List<List<Integer>> partitions = new ArrayList<>();
        for (int i = 0; i < array.length; i += partitionSize) {
            List<Integer> partition = new ArrayList<>();
            for (int j = i; j < i + partitionSize && j < array.length; j++) {
                partition.add(array[j]);
            }
            partitions.add(partition);
        }
        partitions.sort(Comparator.comparingInt(partition -> partitionOrder[partitions.indexOf(partition)]));
        int[] result = new int[array.length];
        int index = 0;
        for (List<Integer> partition : partitions) {
            for (int value : partition) {
                result[index++] = value;
            }
        }
        return result;
    }
}
