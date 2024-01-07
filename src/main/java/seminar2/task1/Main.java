package seminar2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность матрицы: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Размерность матрицы должна быть положительным числом!");
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Элемент [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        System.out.println("След матрицы: " + trace);
    }
}
