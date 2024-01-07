package seminar2.hw;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        // Проверяем, что число n неотрицательное
        if (n < 0) {
            System.out.println("Число должно быть неотрицательным.");
            return;
        }

        // Выводим таблицу умножения в требуемом формате
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
