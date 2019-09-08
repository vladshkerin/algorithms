import java.util.Arrays;

// Сортировка вставками
// Алгоритм: на каждом шаге выбирается один из элементов входных данных и помещается
//  на нужную позицию до тех пор, пока набор входных данные не будет исчерпан.
// Сложность: O(n^2)
// Затраты памяти: O(n) всего, O(1) дополнительно
public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        int[] result = insertionSort.sort(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }

    private int[] sort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        return array;
    }
}
