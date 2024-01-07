package seminar2.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите число отображения таблицы умножения: ");
        int num = myScanner.nextInt();

        System.out.println(tableOfMultiplication(num));
    }

    private static String tableOfMultiplication(int num) {
        if (num < 1 || num > 9) {
            return "Таблица умножения выводится для чисел от 1 до 9!";
        }
        StringBuilder result = new StringBuilder();
        result.append("___________________").append("\n");
        for (int i = 1; i < 10; i++) {
            result.append(num).append(" ").append("*")
                    .append(" ").append(i)
                    .append(" ").append("=")
                    .append(" ").append(num * i)
                    .append("\n").append("___________________")
                    .append("\n");
        }
        return result.toString();
    }

}
