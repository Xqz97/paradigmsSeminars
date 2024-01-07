package seminar2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число в десятичной системе: ");
        int number = scanner.nextInt();

        System.out.print("Введите желаемую систему счисления (от 2 до 36): ");
        int base = scanner.nextInt();

        String result = convertDecimalToBase(number, base);
        System.out.println("Результат: " + result);
    }


    private static String convertDecimalToBase(int number, int base) {
        if (base < 2 || base > 36) {
            return "Некорректная система счисления.";
        }

        if (number == 0) {
            return "0";
        }

        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int digit = number % base;
            result.insert(0, digits.charAt(digit));
            number /= base;
        }

        return result.toString();
    }

}
