// Бинарный поиск
// Сложность: O(log n)
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = new int[100000000];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }
        System.out.println(algorithm(list, 23456));
    }

    private static int algorithm(int[] list, Integer item) {
        int low = 0;
        int high = list.length - 1;
        int mid, guess;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = list[mid];

            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
