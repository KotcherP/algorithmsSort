import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class TestSortTime {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100_000];
        int[] arr2;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(1000);
        }

        arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println("Bubble sort");
        System.out.println("Start: " + LocalTime.now());
        BubbleSort.bubbleSort(arr2);
        System.out.println("End: " + LocalTime.now());

        arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println("Merge sort");
        System.out.println("Start: " + LocalTime.now());
        MergeSort.mergeSort(arr2);
        System.out.println("End: " + LocalTime.now());

        arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println("Quick sort");
        System.out.println("Start: " + LocalTime.now());
        QuickSort.doSort(arr2,0,arr2.length-1);
        System.out.println("End: " + LocalTime.now());

    }

}
