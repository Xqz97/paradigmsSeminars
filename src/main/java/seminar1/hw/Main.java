package seminar1.hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 0, -1};
        printArray(bubbleSortImperative(array));
        System.out.println("\n");
        printArray(sortArrayDeclarative(array));

    }

    public static int[] bubbleSortImperative(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // меняем местами arr[j] и arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArrayDeclarative(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);

        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


}
