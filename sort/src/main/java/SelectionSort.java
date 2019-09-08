import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

// Сортировка выбором
// Алгоритм: каждый проход выбирать самый минимальный элемент и смещать его в начало.
//  При этом каждый проход начинать сдвигаясь вправо, то есть первый проход - с первого элемента,
//  второй проход - со второго.
// Сложность: O(n^2)
// Затраты памяти: O(n) всего, O(1) дополнительно
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        int[] result = selectionSort.sort(Arrays.copyOf(array, array.length));

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }

    private int[] sort(int[] array) {
        for (int min = 0; min < array.length -1; min++) {
            int least = min;
            for (int j = min; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            ArrayUtils.swap(array, min, least);
        }
        return array;
    }
}
