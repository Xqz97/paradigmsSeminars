package seminar1.task1;

import java.util.Arrays;

public class Main {

    //Императивный подход к решению задачи
    public static boolean searchImperative(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    //Декларативный подход к написанию программы
    public static boolean searchDeclarative(int[] array, int target) {
        return Arrays.stream(array)
                .anyMatch(num -> num == target);
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 25, 1};
        int target = 3;

        if (searchImperative(array, target)) {
            System.out.println("Значение " + target + " найдено в массиве!");
        } else {
            System.out.println("Значение " + target + " не найдено в массиве.");
        }

        if (searchDeclarative(array, target)) {
            System.out.println("Значение " + target + " найдено в массиве!");
        } else {
            System.out.println("Значение " + target + " не найдено в массиве.");
        }
    }
}
