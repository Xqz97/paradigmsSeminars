package seminar1.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 0, -1};
        System.out.println(findFractionInArrayImperative(array));
        System.out.println(findFractionInArrayDeclarative(array));
    }

    //Императивная парадигма
    public static String findFractionInArrayImperative(int[] array) {
        if (array.length == 0) {
            return "Передан пустой массив";
        }

        int countPositiveNum = 0;
        int countZeroNum = 0;
        int countNegativeNum = 0;
        int arrayLength = array.length;

        for (int num : array) {
            if (num > 0) {
                countPositiveNum++;
            }
            if (num < 0) {
                countNegativeNum++;
            }
            if (num == 0) {
                countZeroNum++;
            }
        }

        double fractionOfPositiveNum = (double) countPositiveNum / arrayLength;
        double fractionOfZeroNum = (double) countZeroNum / arrayLength;
        double fractionOfNegativeNum = (double) countNegativeNum / arrayLength;

        return "Найденные доли: " + " " + String.valueOf(fractionOfPositiveNum) + " "
                + String.valueOf(fractionOfZeroNum)
                + " " + String.valueOf(fractionOfNegativeNum);
    }

    // Декларативная парадигма
    public static String findFractionInArrayDeclarative(int[] array) {
        if (array.length == 0) {
            return "Передан пустой массив";
        }

        long countPositiveNum = Arrays.stream(array)
                .filter(num -> num > 0)
                .count();

        long countZeroNum = Arrays.stream(array)
                .filter(num -> num == 0)
                .count();

        long countNegativeNum = Arrays.stream(array)
                .filter(num -> num < 0)
                .count();

        double fractionOfPositiveNum = (double) countPositiveNum / array.length;
        double fractionOfZeroNum = (double) countZeroNum / array.length;
        double fractionOfNegativeNum = (double) countNegativeNum / array.length;

        return "Найденные доли: " + " " + String.valueOf(fractionOfPositiveNum) + " " + String.valueOf(fractionOfZeroNum)
                + " " + String.valueOf(fractionOfNegativeNum);
    }

}
