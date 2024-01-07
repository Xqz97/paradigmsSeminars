package seminar6.task1.view;

import seminar6.task1.model.Stopwatch;

import java.util.Scanner;

public class ConsoleView {
    private Stopwatch stopwatch;

    public ConsoleView(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    public void displayMenu() {
        System.out.println("Меню:");
        System.out.println("1. Запуск");
        System.out.println("2. Пауза");
        System.out.println("3. Возобновление");
        System.out.println("4. Сброс");
        System.out.println("5. Выход");
        System.out.println("Введите номер операции:");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Запуск
                    stopwatch.start();
                    break;
                case 2: // Пауза
                    stopwatch.pause();
                    break;
                case 3: // Возобновление
                    stopwatch.resume();
                    break;
                case 4: // Сброс
                    stopwatch.reset();
                    break;
                case 5: // Выход
                    stopwatch.exit();
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
                    break;
            }
        }
    }
}
