package seminar6.hw;

public class QuickSort {


    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
// Выбираем опорный элемент
            int pivotIndex = partition(arr, low, high);

// Рекурсивно сортируем элементы перед опорным и после опорного элемента
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

// Меняем элементы местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

// Меняем опорный элемент с первым элементом больше опорного
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
