import java.util.Arrays;

// Сортировка пузырьком
// Алгоримт: последовательно пройтись по всем элементам массива и поменять местами рядом стоящие, если a > b
// Сложность: O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        int[] result = bubbleSort.sort(array);
        System.out.println(Arrays.toString(result));
    }

    private int[] sort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        return array;
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
