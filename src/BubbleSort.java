import java.util.Arrays;

//сортировка пузырьком, О(n^2),по-возрастанию
public class BubbleSort {
    public static void main(String[] args) {

        //int[] arr = {9,3,4,7,4,6,5,8};
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < arr.length; i++) {
                int left = i - 1;
                int right = i;
                if (arr[left] > arr[right] ) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    isSorted = true;
                }
            }
        }
    }
}
