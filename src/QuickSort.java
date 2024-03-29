import java.util.Arrays;
import java.util.Random;

//быстрая сортировка,O(n log n)
public class QuickSort{

    public static void main(String[] args) {

        int[] array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        doSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void doSort(int[] array,int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array,start, cur);
        doSort(array,cur + 1, end);
    }

}
